let
  pkgsPin = "https://github.com/NixOS/nixpkgs/archive/d6b3ddd253c5.tar.gz";
  testRunScript =
    "cd $projectdir/test && javac cheesTest.java && java cheesTest && cd -";
in { pkgs ? import (fetchTarball pkgsPin) { } }:
pkgs.mkShell {
  nativeBuildInputs = with pkgs.buildPackages; [ jdk17 vscode ];

  shellHook = ''
    projectdir="$(pwd)"

    alias testrun="${testRunScript}";    
    # alias run=

    code . >/dev/null 2>&1 &!
  '';
}
