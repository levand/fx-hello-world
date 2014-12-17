# Setting Up Feature Expressions

Feature expressions are a new feature of Clojure targeted for release in the not-too distant future. Read all about them here: http://dev.clojure.org/display/design/Feature+Expressions

Impatient fellow that I am, I really wanted to start trying them out, but the patches haven't been applied to the official repositories yet.

So, I forked the relevant repos, applied the patches, and tweaked things until they worked. It was slightly painful to get started, so I'm making the forked repos available in case anyone else wants to start experimenting with them.

To get this working, you'll need to clone these repositories:

    https://github.com/levand/clojure.git
    https://github.com/levand/clojurescript.git
    https://github.com/levand/tools.reader.git
    https://github.com/levand/lein-cljsbuild.git

Then (assuming you unzipped them all into `~/src` run:

    cd ~/src/clojure && git checkout feature-expressions && mvn install
    cd ~/src/clojurescript && git checkout feature-expressions && lein install
    cd ~/src/tools.reader && git checkout feature-expressions && lein install
    cd ~/src/lein-cljsbuild && git checkout feature-expressions
    cd ~/src/lein-cljsbuild/cljs-compat && lein install
    cd ~/src/lein-cljsbuild/support && lein install
    cd ~/src/lein-cljsbuild/plugin && lein install

### Leinignen Support

If you want full leiningen support (such as `lein test` and AOT compilation) you'll need the modified version of leiningen and its dependencies as well:

    https://github.com/levand/leiningen.git
    https://github.com/levand/bultitude.git

Checkout the `feature-expressions` branch in each of these repositories, and install as per leiningen's contribution instructions.

`lein test` is known to work. `lein compile` should probably work but is untested.

# Running the hello-world

To run the hello world app in Clojure, pop open a repl, require and invoke `fx-hello-world.hello/hello`.

To check things out in ClojureScript, hit `lein cljsbuild once`, inspect the end of the output file in `target/fx-hello-world.js` and validate that it emitted the correct JavaScript code. Include it into a HTML page and call it via the web inspector, if you're feeling ambitious.

# Thanks & Caveats

Many thanks to all who contributed ideas and patches for feature expressions. Special thanks to Alex Miller, who has tirelessly herded cats for a long time to make this happen.

If you experience problems or have ideas, please participate in the design discussion around feature expressions through the wiki page linked above, or through comments on the pertintent JIRA tickets.



