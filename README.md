# AntGAEDemo

This is a demo that uses Ant to download all dependencies needed to run JUnit test cases, which are also managed via a build script. 

Since Eclipse and Maven integrate quite poorly with each other when the Google App Engine plugin is also used, using ant allows us to maintain the GAE plugin structure so things like hot deploy continue to work, preserving an important piece of the developer workflow.

## Install dependencies

```
$ ant download
```

## Run tests

```
$ ant eclipse-test-runner
```

## Configure Eclipse to run tests automatically on each save

- Right click on the project, and select "Properties"
- In the left menu of the modal window, select "Builders"
- On the right side of the modal window, Click "New"
- Select "Ant Builder", and click "OK"
- Enter a name for the builder: "MyTestProject_Auto_JUnit"
- In the "Buildfile" section, click "Browse Workspace..." and select the build.xml file.
- Click "Apply"
- Click the "Targets" tab. In the "Auto Build" section, click "Set Targets..."
- In the "Check targets to execute" section, uncheck any selected targets, and select "eclipse-test-runner". Click "OK"
- Click "Apply"

Now, whenever you save your changes, the JUnit tests will run automatically.

