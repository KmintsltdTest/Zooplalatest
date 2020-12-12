package co.uk.Zoopla.runners;
import  io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/co/uk/Zoopla/features" }
        ,plugin = {"pretty","json:target/report.json","de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"},
        glue= {"co/uk/Zoopla/Hook","co/uk/Zoopla/stepDefinitions"}
        ,tags="@ignore" //this makes sure only feature files with @ignore will run  remember to always add # to testdata when using data from a scenario outline in feature
)
public class TestRunner
{
    // this is only used to generate the stepdefinitions
}
