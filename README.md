# Uncharted Spark Pipeline &nbsp;[![Build Status](https://travis-ci.org/unchartedsoftware/sparkpipe-core.svg?branch=master)](https://travis-ci.org/unchartedsoftware/sparkpipe-core)&nbsp;[![Coverage Status](https://coveralls.io/repos/unchartedsoftware/sparkpipe-core/badge.svg?branch=master&service=github)](https://coveralls.io/github/unchartedsoftware/sparkpipe-core?branch=master)

> [http://unchartedsoftware.github.io/sparkpipe-core](http://unchartedsoftware.github.io/sparkpipe-core)

[Apache Spark](http://spark.apache.org/) is a powerful tool for distributed data processing. Enhancing and maintaining productivity on this platform involves implementing Spark scripts in a modular, testable and reusable fashion.

The Uncharted Spark Pipeline facilitates expressing individual components of Spark scripts in a standardized way so that they can be:

  - connected in series (or even in a more complex dependency graph of operations)
  - unit tested effectively with mock inputs
  - reused and shared

## Quick Start

Try the pipeline yourself using spark-shell:

```bash
$ spark-shell --packages software.uncharted.sparkpipe:sparkpipe-core:0.9.5
```

```scala
scala> import software.uncharted.sparkpipe.Pipe
scala> Pipe("hello").to(_+" world").run
```

Assuming you have a file named [people.json](https://raw.githubusercontent.com/apache/spark/master/examples/src/main/resources/people.json), read a DataFrame from a file and manipulate it:
```scala
scala> :paste
import software.uncharted.sparkpipe.Pipe
import software.uncharted.sparkpipe.ops

Pipe(sqlContext)
.to(ops.core.dataframe.io.read("people.json", "json"))
.to(ops.core.dataframe.renameColumns(Map("age" -> "personAge")))
.to(_.filter("personAge > 21").count)
.run
```


## Included Operations

The Uncharted Spark Pipeline comes bundled with core operations which perform a variety of useful tasks, and are intended to serve as aids in implementing more domain-specific operations.

For more information, check out the [docs](http://unchartedsoftware.github.io/sparkpipe-core).
