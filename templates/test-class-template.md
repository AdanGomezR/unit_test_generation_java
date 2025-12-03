# Plantilla de clase de test (JUnit 5 + Mockito)

```java
package {{packageName}};

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class {{className}}Test {

    @Mock
    private {{dependencyType}} {{dependencyName}};

    @InjectMocks
    private {{className}} {{instanceName}};

    @Test
    void shouldDoSomething_whenCondition() {
        // Arrange
        // TODO configurar mocks y datos de entrada

        // Act
        // var result = {{instanceName}}.methodUnderTest(...);

        // Assert
        // assertThat(result).isNotNull();
        // verify({{dependencyName}}).someMethod(...);
    }
}
```
