@echo off
rmdir /s /q builds\latest 2>nul
"C:\Users\cyrus\.jdks\openjdk-21.0.2\bin\jpackage" --type app-image --input out/artifacts/VisualNovel_jar --main-jar VisualNovel.jar --main-class Main.Main --name VisualNovel --win-console --dest builds\latest
pause