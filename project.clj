(defproject aoc "2018-1"

  :description  "Our code for the annual Advent of Code for 2018"

  :dependencies     [[org.clojure/clojure "1.9.0"]
                     [org.clojure/tools.logging "0.3.1"]
                     [log4j "1.2.15"
                      :exclusions [javax.mail/mail
                                   javax.jms/jms
                                   com.sun.jdmk/jmxtools
                                   com.sun.jmx/jmxri]]
                     [org.slf4j/slf4j-log4j12 "1.6.1"]]

  :dev-resources-path     "dev-resources"

  )
