package test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="@Rerun\\failed.txt",glue="major.pac",dryRun=false,
plugin="C:\\Users\\Balaji S\\eclipse-workspace1\\TiaGateway\\Rerun\\failed.txt")

public class TestReRunner {

}
