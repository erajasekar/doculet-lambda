# Doculet Lambda - Backend for Doculet


Doculet lambda is backend for [doculet app](https://github.com/erajasekar/doculet) to support [oembed](https://oembed.com/) API. It's basically a AWS lambda implementation exposed as AWS gateway rest API.

Live website: https://doculet.net/

## Getting Started

To build and install you will need [Maven](https://maven.apache.org/) and the [AWS CLI](https://aws.amazon.com/cli/) installed on your computer.

* Clone the Repository.

* Run `mvn package` to build a deployable jar.

* You will need an AWS S3 bucket to store the artifacts for deployment. So create S3 bucket.

*  Run the following command 

  ```sh
  aws cloudformation package --template-file sam.yaml --output-template-file output-sam.yaml --s3-bucket <YOUR S3 BUCKET NAME>
  ```

* You can now use the cli to deploy the application. Run this command to deploy

  ```sh
  aws cloudformation deploy --template-file output-sam.yaml --stack-name DoculetLambdaApi5 --capabilities CAPABILITY_IAM
  ```

* Once the application is deployed, you can describe the stack to show the API endpoint that was created. Run this command

  ```sh
  aws cloudformation describe-stacks --stack-name DoculetLambdaApi5
  ```

* The value of `OutputValue` will give you the AWS gateway end point where application is deployed.

