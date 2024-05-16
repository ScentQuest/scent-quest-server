package com.scentquest.configuration;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import lombok.RequiredArgsConstructor;
import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
@EnableEncryptableProperties
public class JasyptConfig {
  @Value("${jasypt.encryptor.algorithm}")
  private String algorithm;

  @Value("${jasypt.encryptor.pool-size}")
  private int poolSize;

  @Value("${jasypt.encryptor.string-output-type}")
  private String stringOutputType;

  @Value("${jasypt.encryptor.key-obtention-iterations}")
  private int keyObtentionIterations;

  @Value("${jasypt.encryptor.password}")
  private String password;

  @Bean
  public StringEncryptor jasyptStringEncryptor() {
    var encryptor = new PooledPBEStringEncryptor();
    encryptor.setPoolSize(poolSize);
    encryptor.setAlgorithm(algorithm);
    encryptor.setPassword(password);
    encryptor.setStringOutputType(stringOutputType);
    encryptor.setKeyObtentionIterations(keyObtentionIterations);
    return encryptor;
  }
}