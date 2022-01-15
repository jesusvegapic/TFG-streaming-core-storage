package es.jesusvegapic.TFGsteamingcorejava.infrastructure.api;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

// Los usuarios autorizados en esta API son administradores o moderadores
@PreAuthorize("hasRole('ADMIN') or hasRole('MOD')")
@RestController
@SecurityRequirement(name = "bearerAuth")
public @interface Rest {
}
