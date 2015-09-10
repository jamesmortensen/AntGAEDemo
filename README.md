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

## Configure Jenkins Continuous Integration

This assumes you've already installed Jenkins. See the Jenkins documentation for instructions.

- In the Jenkins dashboard, click "New Item".
- In the "Item Name" field, enter the name of the project, "AntGAEDemo".
- Click the "Freestyle Project" radio button, and click "OK".
- Paste in the URL of the GitHub repository page, https://github.com/jamesmortensen/AntGAEDemo, in the "GitHub project" field.
- In the "Source Code Management" section, select the "Git" radio button.
- Enter "https://github.com/jamesmortensen/AntGAEDemo.git" in the "Repository URL" field.
- In the "Build" section, click the "Add Build Step" dropdown, and click "Invoke Ant".
- Select your ant installation in the "Ant Version" dropdown.
- In the "Targets" section, enter "download eclipse-test-runner" to specify the download and eclipse-test-runner targets.
- Click "Save"
- Test the configuration by clicking "Build Now" in the left menu of the project dashboard.


## Configure Eclipse to recognize Cucumber

- In Eclipse, right click on the project name and select "Build Path" then "Configure Build Path".
- Under the Libraries tab, click "Add JARs...".
- In the test-lib folder, select all the JARs except JUnit, and click "OK".
- You may need to exclude the cucumber package from appengine validation. The help tooltip text will suggest options.
