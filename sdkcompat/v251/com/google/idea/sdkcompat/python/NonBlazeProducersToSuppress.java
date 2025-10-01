package com.google.idea.sdkcompat.python;

import com.google.common.collect.ImmutableList;

public class NonBlazeProducersToSuppress {

  // PyTestsConfigurationProducer has internal visibility. We need to reference it to suppress it.
  @SuppressWarnings("KotlinInternal")
  public static final ImmutableList<Class<?>> PRODUCERS_TO_SUPPRESS =
      ImmutableList.of(
          com.jetbrains.python.testing.nosetestLegacy.PythonNoseTestConfigurationProducer.class,
          com.jetbrains.python.testing.pytestLegacy.PyTestConfigurationProducer.class,
          com.jetbrains.python.testing.unittestLegacy.PythonUnitTestConfigurationProducer.class);
}