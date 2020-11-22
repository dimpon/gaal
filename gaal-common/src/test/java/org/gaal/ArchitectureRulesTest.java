package org.gaal;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import org.gaal.valueobjects.ValueObject;
import org.junit.jupiter.api.Test;


public class ArchitectureRulesTest {
    @Test
    public void some_architecture_rule1() {
        JavaClasses importedClasses = new ClassFileImporter().importPackages("org.gaal");

        ArchRule rule =  classes()
                .that().resideInAPackage("..dto..")
                .should().haveSimpleNameEndingWith("DTO");

        rule.check(importedClasses);
    }

    @Test
    public void some_architecture_rule2() {
        JavaClasses importedClasses = new ClassFileImporter().importPackages("org.gaal");

        ArchRule rule =  classes()
                .that().resideInAPackage("..valueobjects..")
                .and().doNotHaveSimpleName("ValueObject").and()
                .haveSimpleNameNotEndingWith("Test")
                .should().implement(ValueObject.class);

        rule.check(importedClasses);
    }
}
