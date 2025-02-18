# Arlington HSPC 2025 Infrastructure Documentation

[DOMJudge Manual](https://www.domjudge.org/docs/manual/8.2/index.html)

## Writing Problems

- Example problem format in the `car-chase-original` directory. 
- The format we used when writing the problems was arbitrary and could be
  changed if you want.
- The generator script isn’t used to generate test cases during the competition,
  only to generate the test case ahead of time.
- The sample-input.txt comes from the problem statement.
- I generated the pdf from the markdown file using pandoc but any md -> pdf
  render is fine.
- The samples should only parse the input, not manipulate further
- The samples should have comments explaining what the parameters are and what
  the return value should be
- The solutions should be written based on the samples

## Importing Problems to DOMJudge

- If the accepted submissions aren’t included, the test cases will not be imported.
- The yaml file only needs the key “name”
- [Problem format specification](https://www.domjudge.org/docs/manual/8.2/problem-format.html)
  (validators aren't needed)
- Example format in `car-chase-domjudge-packaged`
- The directory with the data should be zipped then can be sent to domjudge
  through the REST api or the web interface

## Importing Competition data to DOMJudge

- The data we used for our competition is included in the `domjudge-data`
  directory

## Editor Setup

- We used [code-server](https://github.com/coder/code-server) to host the remote
  VS Code instances
- We used the [Task](https://github.com/go-task/vscode-task) plugin to make
  running local solutions easy, the sample task files are included in the
  `container` directory
- The containers only need the 2 samples, the sample input, and the 2 task files

## Actual Hosting

- This year we used a cluster of 11 Raspberry Pi 4s as part of a [Docker
  Swarm](https://docs.docker.com/engine/swarm/).
- This worked but because the effort to organize all of the Pis, I would not
  recommend doing that in the future.
- We ran everything on docker, which is something I would recommend doing again
- We hosted 3 main "stacks" of services
    - The team containers
        - A code-server instance for each teach
    - The domjudge instance
        - A MariaDB instance
        - DOMServer
        - 4 Judgehosts (can be scaled up and down as needed)
    - Documentation
        - Java documentation on an nginx container
        - Python documentation on an nginx container

## Custom DOMJudge Instance

- We used a custom version of DOMJudge that allowed people to paste solutions in
  instead of uploading a file, which worked better with our remote VS Code
  instances
- In order to build the docker containers, zip the domjudge source directory
  into `domjudge.tar.gz` and put it in the `docker` directory of the
  `domjudge-packaging` repository
- Then build the containers with the `build.sh` script
