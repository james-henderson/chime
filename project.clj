(defproject jarohen/chime "0.3.0"
  :description "A really lightweight Clojure scheduler"

  :url "https://github.com/james-henderson/chime.git"

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.10.1"]
                 [clj-time/clj-time "0.15.2" :scope "provided"]
                 [org.clojure/core.async "0.7.559"]]

  :profiles {:dev {:source-paths ["test"]
                   :dependencies [[clj-time/clj-time "0.15.2"]]}})
