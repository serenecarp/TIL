# GitHub GuideLine

###### by.박재민

## 1. 최초 1회

1. github/gitlab 원본이 되는 repository를 fork 해옴(내가 그 repository의 주인이 아닐 경우)
2. 내 계정에 있는 fork 해온 repository의 주소를 복사한다.
3. 내 컴퓨터에 github/gitlab을 업로드/다운로드할 폴더를 만든다
4. 그 폴더 안에서 `$git init`을 한다
5. `$git config --local/--global user.name/user.email <username/useremail>` 먼저 설정한다.
6. `$git remote add origin <원격 저장소 주소>` → 2번에서 복사한 주소 붙여넣기
7. `$git pull origin master`
   - 잘 안되면 `$git pull origin master --allow-unrelated-histories` 시도
     - 서로 관련 기록이 없는 두 프로젝트를 병합할 때 git이 거부하는데 이를 해결하는 명령어
     - 이거하면 아마 conflict 꽤 나는데 visual stuido 로 들어가서 어떤 파일의 내용으로 할지 골라야 함
8. `$git checkout -b <branch>`
   - `<branch>`라는 이름의 브랜치를 만들어서 그 브랜치로 전환한다.
   - 브랜치가 이미 있을 경우 `$git checkout <branch>`로 해도 됨
   - 원격 저장소에 원하는 브랜치가 있을 경우 
     1. `$git remote update` 를 이용해 브랜치 최신화
     2. `$git branch -a`를 이용해 모든 브랜치 목록에서 원하는 브랜치 이름 확인
     3. `$git branch -t <branch>` 명령어를 이용해 브랜치 가져오기
9. 작업한다
10. `$git checkout <내 브랜치>` 명령어를 이용해 브랜치를 바꾼다.
    - 8번 작업 이미 한 경우 브랜치 뭔지 다시 한번 확인만 
11. 작업 후 `$git add` 명령어를 이용해 staging area?로 파일을 올린다.
12. `$git commit -m "msg"`를 이용해 커밋 메시지 남긴다.
13. `$git push origin <내 브랜치 이름>` 명령어로 ***내 브랜치***에 push 한다.
14. gitlab/github에 들어가면 request merge request 이런게 있는데 그거 클릭하고 커밋 메시지 다시 확인 후 request 버튼 클릭
    - gitlab의 경우 내가 만들어놓은 브랜치가 지워지지 않도록 체크박스를 잘 확인해야 한다.



## 2. 다른 컴퓨터로 이동해서 작업시

- 다른 컴퓨터에서 작업한 이력이 없을 경우 위 최초 1회 과정은 해야 한다.

1. fork 해온 repository에 가서 sync fork에서 update branch를 눌러서 해당 repository를 최신화한다.
2. git bash 창을 띄운다.
3. `$git remote update` 명령어를 이용해 로컬 브랜치를 최신화한다.
4. `$git remote branch`를 이용해 branch 목록 확인한다.
5. `$git checkout <branch>` 를 이용해 원하는 브랜치로 전환한다.
   - 원격 브랜치 목록 중 가져오고 싶은 브랜치가 있을 경우
     1. `$git branch -a` 명령어를 이용해 모든 브랜치 명을 확인한다.
     2. `$git checkout -t <branch>` 명령어를 이용해 원하는 브랜치를 로컬로 가져온다.
6. `$git pull origin <branch>` 명령어를 이용해 최신화된 브랜치를 pull 해준다.
7. 1-9부터 동일하게 진행한다.
