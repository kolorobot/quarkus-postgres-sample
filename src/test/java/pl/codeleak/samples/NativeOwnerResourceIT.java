package pl.codeleak.samples;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeOwnerResourceIT extends OwnerResourceTest {

    // Execute the same tests but in native mode.
}