package Steprunnerfile;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(features = "Featurefile",
        glue = {"Loginpagesteps"},
        dryRun = true,
        monochrome = true,
        plugin = {"pretty", "html:test-output.html"}
)
public class runnerfile{

}
