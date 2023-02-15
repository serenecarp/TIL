# .md (Markdown)

typora에서 필기함.

## heading

- h1 → `#` → html `<h1>내용물</h1>`
- h2 → `##`
- h3 → `###`
- h4 → `####`
- h5 → `#####`
- h6 → `######`

`ctrl` + `숫자` 로 전환 가능

(notion에서는 `ctrl` + `shift` + `숫자`)

## list

### unordered list (순서가 없는 리스트)

`*` / `-`

- a
    - b
        - c
            - d
                - e
                    - f

html → `<ul></ul>`

### ordered list (순서가 있는 리스트)

`숫자` + `.`

1. 순서가 있는 리스트 1
2. 순서가 있는 리스트 2
    1. 순서가 있는 리스트 2의 1 (notion에서는 a가 되네)
        1. 순서가 있는 리스트 2의 1의 1 (notion은 다르네)

`<ol></ol>`

## text style

### bold

`**` 볼드 `**`

`ctrl` + `b`

안녕하세요 **박성준**입니다. **ㅋㅋ**

### italic

`*` 기울기 `*`

`ctrl` + `i`

안녕하세요 *박성준*입니다. *ㅋㅋ*

- bold + italic
    - 안녕하세요 ***박성준*** 입니다

## hyperlink

### link

`[텍스트](내가 가고 싶은 url)`

[구글](https://google.com)

[네이버](https://naver.com)

—> 노션은 우클릭으로 해야 하는 듯

### img

`![대체 텍스트](이미지 주소)`

![핸섬치킨]([https://t4.ftcdn.net/jpg/04/18/86/09/360_F_418860907_ITm0XoEddgOAxhliK8jngOqH0y4jK1nS.jpg](https://t4.ftcdn.net/jpg/04/18/86/09/360_F_418860907_ITm0XoEddgOAxhliK8jngOqH0y4jK1nS.jpg))

—> 노션에서는 그냥 주소 복사하면 알아서 가능

## Code Block

### inline code block

백틱( ` )을 활용해서 인라인 코드를 만들 수 있다.

글 1, 글 2, 글 3, `코드1`

### code block

백틱을 3번 입력

```java
// TIL/intro1.java 주석

class sample {
    public static void main(String args[]){
        System.out.println("Hello Java");
    }
}
```

## Table

`|` bar을 이용

`| | | |` 입력시 ‘3’열을 가진 표 생성, 이후 칸 수 조절

notion의 경우 `/표` 입력