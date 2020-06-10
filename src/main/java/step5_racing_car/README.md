기능을 구현하기 전에 README.md 파일에 구현할 기능 목록을 정리해 추가한다


App
- RacingGame -> app controller
    1. inputView 자동차 대수는 몇 대 인가요?  
                  a  
                  시도할 회수는 몇 회 인가요?  
                  b  
                  출력(실행)
    2. input값 car 도메인에 전달.               

Domain
- car
    1. move(a,b)
    2. randomMove()
- carList
    1. getNames() 
    2. getIndexNames()
- RaceCalculator
    1. calculateWinner
    2. calculateFurthestPosition
    
UI
- InputView -> input 넣는 scanner
- ResultView -> 출력할 System.out의 문구들