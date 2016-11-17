(defproject incanter/incanter-zoo "1.9.2-SNAPSHOT"
  :description "Incanter Zoo is a port of Zoo from R."
  :url "http://incanter.org/"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :scm {:name "git"
        :url "https://github.com/incanter/incanter"
        :dir "modules/incanter-zoo"}
  :min-lein-version "2.0.0"
  :dependencies [[incanter/incanter-io "1.9.2-SNAPSHOT"]
                 [clj-time "0.12.2"
                  :exclusions [org.clojure/clojure
                               org.clojure/clojure-contrib]]]
  :profiles {:dev {:dependencies [[clatrix "0.5.0" :exclusions [org.clojure/clojure net.mikera/core.matrix]]
                                  [org.jblas/jblas "1.2.3"]]}}
  )
