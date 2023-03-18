# ptop-server
Peer To People Spring Boot Server
피어투피플
피어투피플은 한 곳에서 강연, 세미나, 축제 등 다양한 행사 정보를 모아 볼 수 있는 서비스입니다. 또한, 뛰어난 강사들과 행사 진행자들을 찾을 수 있습니다.

### 기술 스택
- Java 11
- Spring Boot
- Spring Data JPA
- MySQL
- Swagger

### 기능
- 행사 정보 조회 및 검색
- 강사 및 행사 진행자 정보 조회 및 검색
- 행사 참여 신청 및 취소
- 쿠폰 발급 및 사용
- 포인트 적립 및 사용
### 설치 및 실행 방법
GitHub에서 소스코드를 다운받습니다.
```
git clone https://github.com/kkj53051000/ptop-server.git
```

application.yml 아래 정보를 입력합니다.
```
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/ptop?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC
    username: 
    password: 
    driver-class-name: com.mysql.cj.jdbc.Driver
  jpa:
    hibernate:
      ddl-auto: create
      dialect: org.hibernate.dialect.MySQL8Dialect
    show-sql: true
    properties:
      hibernate.format_sql: true
  mvc:
    pathmatch:
      matching-strategy: ant_path_matcher
```

다음 명령어를 실행하여 프로젝트를 빌드합니다.

```./gradlew build```

빌드된 jar 파일을 실행합니다.

```java -jar build/libs/peer2people-0.0.1-SNAPSHOT.jar```

<br/>

### API 문서
Swagger를 이용하여 API 문서를 제공합니다.