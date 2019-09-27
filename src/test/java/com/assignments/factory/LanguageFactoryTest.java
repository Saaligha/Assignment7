package com.assignments.factory;

import com.assignments.domain.Language;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LanguageFactoryTest {

    @Test
    public void getLanguage() {
        Language language = LanguageFactory.getLanguage("English");
        Assert.assertNotNull(language);
    }
}