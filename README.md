# spring-jpa-exercise

## Endpoint
|API 종류|HTTP|URI|API 설명|
|:-----:|:------------------:|:-----------------------------:|:-----------------------------:|
| Books | GET | /api/v1/books | 전체 책 조회 |
| Hospitals | GET | /api/v1/hospitals | 전체 병원 조회 |
|  | GET | /api/v1/hospitals/{id} | 클릭한 병원 정보 + 리뷰 조회 |
|  | GET | /api/v1/hospitals/{id}/reviews | 해당 병원의 리뷰만 조회 |
|  | POST| /api/v1/hospitals/{id}/reviews | 해당 병원의 리뷰 등록 |


<div>
  프로젝트로 이동하기 : http://ec2-52-79-234-25.ap-northeast-2.compute.amazonaws.com:8080/api/v1/books
</div>
