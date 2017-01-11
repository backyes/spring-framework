package org.springframework.web.reactive.function.client

import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import kotlin.reflect.KClass


/**
 * Extension for [ClientResponse.bodyToMono] providing a [KClass] based variant.
 *
 * @author Sebastien Deleuze
 * @since 5.0
 */
fun <T : Any> ClientResponse.bodyToMono(type: KClass<T>) : Mono<T> = bodyToMono(type.java)

/**
 * Extension for [ClientResponse.bodyToFlux] providing a [KClass] based variant.
 *
 * @author Sebastien Deleuze
 * @since 5.0
 */
fun <T : Any> ClientResponse.bodyToFlux(type: KClass<T>) : Flux<T> = bodyToFlux(type.java)


