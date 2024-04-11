{ pkgs ? import <nixpkgs> { } }:
pkgs.mkShell {
  nativeBuildInputs = with pkgs.buildPackages; [
    jdk17
    jetbrains.idea-community
  ];

  shellHook = ''
    idea-community . &
    # !ask Nate how java linkers work
    #alias build="javac "
  '';
}
