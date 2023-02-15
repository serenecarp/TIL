# git

ctrl shift + - 확대 축소

## git 계정 설정시 최초 1회

- github은 전역으로 관리 `--global`
    - ㄹㅇ 최초 1회
- gitlab은 지역으로 관리 `--local`
    - 레포를 만들 때마다 최초 1회
    
    ---
    
- gitlab 전용
    - `$ git config --local [user.email](http://user.email) '[내 github email]'`
        - git 작업하는 폴더에만 gitlab email 설정
        - `$ git config --local user.email`
    - `$ git config --local user.username '[내 github username]'`
        - git 작업하는 폴더에만 gitlab username 설정
        - `$ git config --local user.username`
    
    ---
    
- github
    - `$ git config --global [user.email](http://user.email) '[내 github email]'`
        - 내 로컬 컴퓨터 전역에 github email 설정
        - `$ git config --global [user.email](http://user.email)`
    - `$ git config --global [user.name](http://user.name) '[내 github username]'`
        - 내 로컬 컴퓨터 전역에 github username 설정
        - `$ git config --global user.name`

## git으로 폴더를 앞으로 관리할 때 최초 1회

- `git init` : git 시작하기, 이 특정 폴더를 이제 git으로 관리할거야~
- `git remote add origin [github repo 주소]`
    - remote 등록
    - 레포지토리 이름 등록

## git으로 작업할 때 빈번하게 사용하는 애들

- `git status` : git으로 관리되고 있는 폴더의 현황 조회
    - 커밋 전단계까지만 확인 가능
- `git add` : git에게 tracking을 요청
    - staging area에 올려줘!
        1. `git add [파일이름.확장자]`
        2. `git add [파일이름1.확장자] [파일이름2.확장자]`
            - 띄어쓰기가 포함된 파일이라면? → `''` / `""` 따옴표로 감싸준다
        3. `git add .` : 전체를 다 올려줘
- `git commit -m '[커밋 메시지]'` : staging area에 올린 컨텐츠에 커밋 메시지 남기기
    - 커밋 메시지 국룰: 명령조로 작성한다 (ex. create a file, 테스트 파일 생성..)
- `git log` : 커밋 메시지 확인
    - 커밋 남긴 후에만 확인 가능
    - `git log --oneline` :  한 줄로
- `$ git push origin master` : github에 파일 모두 올리기(master는 브랜치의 개념을 알아야 한다. 필요시 검색)
- `$ git pull origin master` : github에 있는 파일 내려받기
    - 폴더 생성
    - 폴더에 들어가서 `git init`
    - 폴더 안에서 `git remote`
- `$ git clone [내 github repo 주소]`
    - 폴더를 만들지 않고도 바로 내려받기 가능
    - A가 A걸로 clone 받았다 → `add` `commit` `push`
    - B가 A거 clone 받았다 → B가 A의 레포에 자기 코드를 반영하고 싶으면 `pull request` 해야 함
    
    ## git branch
    
    - intro
        
        master (통로 == 브랜치)
        
        origin (별명)
        
        브랜치 → 새로운 통로 만들기
        
    
    참고: [https://backlog.com/git-tutorial/kr/stepup/stepup1_1.html](https://backlog.com/git-tutorial/kr/stepup/stepup1_1.html)
    
- 브랜치 시작하기
    - `$ git branch` : 나의 현재 브랜치
        - `*` 내가 지금 있는 브랜치 (초록색으로 표현됨)
    - `$ git branch [브랜치 이름]` : 브랜치 생성
        - 아무런 응답이 없다
        - 이미 있는 브랜치는 생성 새로 불가
    - `$ git switch [브랜치 이름]` `$ git checkout [브랜치 이름]` :해당 브랜치로 이동
        - 브랜치 현황에 있는 브랜치로만 이동 가능
    
    ## git merge
    

e.g. Branch 1 → Branch 2

- Branch 1에 있는 파일들을
    1. `add` , `commit`
    2. Branch 2로 이동
- `$ git merge [merge하고 싶은 브랜치 이름]`

## pull request

github에서 브랜치를 merge할 때 사용되는 일종의 명령

## 박재민님 git 팁 정리

[GitGuideLine_Jaemin(230119).md](git%2035163bdcbc364d20927522099c29c2c6/GitGuideLine_Jaemin(230119).md)