{
  description = "Bad CLI chess made in java for practice.";

  inputs = { nixpkgs.url = "github:nixos/nixpkgs?ref=nixos-unstable"; };

  outputs = { self, nixpkgs, ... }:
    let
      allSystems = [
        "x86_64-linux" # 64-bit Intel/AMD Linux
        "aarch64-linux" # 64-bit ARM Linux
        "x86_64-darwin" # 64-bit Intel macOS
        "aarch64-darwin" # 64-bit ARM macOS
      ];

      forAllSystems = f:
        nixpkgs.lib.genAttrs allSystems (system:
          f {
            pkgs = import nixpkgs {
              system = system;
              config.allowUnfree = true;
            };
          });
    in {
      devShells = forAllSystems ({ pkgs }: {
        default = pkgs.mkShell {
          nativeBuildInputs = with pkgs; [ jdk17 maven vscode ];
          shellHook = ''
            code . &! exit
          '';
        };
      });

      packages = forAllSystems ({ pkgs }: {
        default = pkgs.maven.buildMavenPackage rec {
          pname = "javaBadChees";
          version = "1.0";

          src = ./.;

          mvnHash = "sha256-t8grxedA+YCF7JeuvcYKD3u6KzSC6WY+IV3Tl4BbJ34=";

          nativeBuildInputs = [ pkgs.makeWrapper ];

          installPhase = ''
            mkdir -p $out/bin $out/share/${pname}
            install -Dm644 ${src}/target/${pname}-${version}-SNAPSHOT.jar $out/share/${pname}

            makeWrapper ${pkgs.jdk17}/bin/java $out/bin/${pname} \
              --add-flags "-cp $out/share/${pname}/${pname}-${version}-SNAPSHOT.jar ${pname}.App"
          '';

          meta = with pkgs.lib; {
            description = "Bad CLI chess game made in java for practice.";
            homepage = "https://github.com/Pickles888/java-bad-chees";
            license = licenses.gpl3Plus;
            maintainers = with maintainers; [ Pickles888 ];
          };
        };
      });
    };
}
