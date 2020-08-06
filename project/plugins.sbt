
resolvers += Resolver.url("Ivy Plugin Releases", url("https://artifacts.werally.in/artifactory/ivy-plugins-release"))(Resolver.ivyStylePatterns)
resolvers += "Maven Plugin Releases" at "https://artifacts.werally.in/artifactory/plugins-release"

addSbtPlugin("com.dwijnand"      % "sbt-dynver"      % "4.0.0")
addSbtPlugin("com.typesafe"      % "sbt-mima-plugin" % "0.7.0")
addSbtPlugin("org.foundweekends" % "sbt-bintray"     % "0.5.6")
