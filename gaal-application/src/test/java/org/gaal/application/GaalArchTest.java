package org.gaal.application;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packages = "org.gaal")
public class GaalArchTest {

    @ArchTest
    static final ArchRule controllers_should_be_annotated =
            classes().that().resideInAPackage("..controller..")
                    .should()
                    .beAnnotatedWith(RestController.class)
                    .orShould()
                    .beAnnotatedWith(Controller.class);

    @ArchTest
    static final  ArchRule dto_should_being_used_in_controllers_or_valueobjects = classes()
            .that().resideInAPackage("org.gaal.dto")
            .should()
            .onlyBeAccessed()
            .byAnyPackage("org.gaal.dto","org.gaal.valueobjects");

}
