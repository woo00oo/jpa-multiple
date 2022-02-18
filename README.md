## 스프링 부트 환경에서의 다중 데이터소스 연동 예제


하나의 데이터소스를 이용할 때에는 DB가 가진 기능으로도 트랜잭션 처리가 충분히 가능하거나, WAS의 도움을 받을 수 있지만,
다중 데이터 소스를 이용하는 경우 트랜잭션 관리가 매우 중요.

TransactionManager 객체 : 데이터소스를 이용한 데이터의 영속성과 일관성을 보장해주는 트랜잭션을 관리하는 객체

**
데이터 소스가 2개, 트랜잭션 매니저가 2개의 환경에서 @Transaction을 지정하면 @Primary로 우선권을 가지는 트랜잭션 매니저가 실행.
즉, 하나의 데이터는 정상적인 트랜잭션 범위안에 포함 될수 없다.

하지만 스프링에서는 ChainedTransactionManager라는 구현체를 제공하기 때문에 수동으로 트랜잭션을 관리 해야하는 어려움과 복잡함을 간단하게 처리할 수 있다.
-> 위에 설정한 트랜잭션 매니저들을 주입받아 해당 객체를 생성.