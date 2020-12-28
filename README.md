# Google Cloudfunction Example in Scala

### Get started quickly with Google Cloudfunctions in Scala

#### Basics:
- Example Entrypoint for service `cloudfunctions.ExampleFunction`
- Example dataclass for json response body `cloudfunctions.ExampleResponse`
- Tests: `cloudfunctions.ExampleResponseSpec`

#### Uses
- `mvn` (Google Cloud requires Maven or Gradle for cloudfunctions)
- `ScalaTest` (surefire is overridden in `pom.xml`)
- `Gson` for object (de)serialization

#### To start service locally:
- `mvn function:run -Drun.functionTarget=cloudfunctions.ExampleFunction` where `functionTarget` is the path to the service you wish to start. In the example, this is `cloudfunctions.ExampleFunction`.

#### To publish using `gcloud`

```sh
gcloud functions deploy example-scala-function --entry-point cloudfunctions.ExampleFunction --runtime java11 --trigger-http --allow-unauthenticated
```

For more deployment info, see (docs)[https://cloud.google.com/functions/docs/deploying]