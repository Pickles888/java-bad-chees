let pkgsPin = "https://github.com/NixOS/nixpkgs/archive/d6b3ddd253c5.tar.gz";
in { pkgs ? import (fetchTarball pkgsPin) { } }:
pkgs.mkShell {
  nativeBuildInputs = with pkgs.buildPackages; [ jdk17 vscode ];

  shellHook = ''
    code . >/dev/null 2>&1 &
  '';
}
