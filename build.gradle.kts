import de.florianmichael.baseproject.setupProject
import de.florianmichael.baseproject.configureApplication
import de.florianmichael.baseproject.configureShadedDependencies

plugins {
    id("de.florianmichael.baseproject.BaseProject")
}

setupProject()
configureApplication()

val shade = configureShadedDependencies()

dependencies {
    shade("org.apache.pdfbox:pdfbox:2.0.30")
}
