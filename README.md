
---
 
1인 개발 하고 있는 서버 개발자들을 위한 쉽고 빠르게 백엔드 서버를 구축할 수 있는 프로젝트입니다.
이 프로젝트는 최소한의 API(health check)와 DB 연결을 통해 서버를 구축할 수 있도록 도와줍니다.

## 관련 문서
- [소개](https://ppaekkomlog.tistory.com/17)
- [AWS Elastic Beanstalk](https://ppaekkomlog.tistory.com/18)
- [Amazon RDS](https://ppaekkomlog.tistory.com/19)
- [Github Actions(CI/CD)](https://ppaekkomlog.tistory.com/20)
- [Amazon Route 53 + AWS Certificate Manager(ACM) + 가비아](https://ppaekkomlog.tistory.com/21)


## 아키텍처



<p align="center">
  <img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FOtLnj%2FbtswbBVtMJr%2FYxgta1KEgZbGCz6IGaful1%2Fimg.png" alt="HOT" width="number" />
</p>

## 기술 스택
<img src="https://img.shields.io/badge/Amazon RDS-527FFF?style=flat-square&logo=Amazon RDS&logoColor=ffffff" /> <img src="https://img.shields.io/badge/AWS Elastic Beanstalk-FF9900?style=flat-square&logo=amazonec2&logoColor=ffffff" />  <img src="https://img.shields.io/badge/githubactions-2088FF?style=flat-square&logo=githubactions&logoColor=ffffff" />
<img src="https://img.shields.io/badge/Amazon Route 53-8C4FFF?style=flat-square&logo=amazonroute53&logoColor=ffffff" />
<img src="https://img.shields.io/badge/AWS Certificate Manager-F15833?style=flat-square&logo=amazoniam&logoColor=ffffff" />

## 시작하기
```bash
$ git clone
$ cd simple_spring_mvc
$ ./gradlew build
$ java -jar build/libs/*.jar

```
