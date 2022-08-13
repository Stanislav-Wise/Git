В консоле пишем следущее:

**0.git --version** - версия гит
**1.git init** - в этой папке гит начинает отслеживать изменения(*инициализирует*)

git config --global [user.name](http://user.name/) “Denis Yershov”

git config --global user.email anubismclovin@gmail.com
**2.git add +2 первые буквы файла +(tab)** - добавляем файл в гит

**3.git commit -m “”** - сохранение и комментарий к нему

**git checkout (первые 4-5-6-7 символа коммита)/<branch_name>** - вернутся к сохранению/к ветке

**git checkout master** - вернутся к актуальному сохранению или на другую ветку

---

**3.1.git diff** - разницы текущего файла и того, что сохранено

**3.2.git log** - журнал всех изменений

**git log --graph** - с визуализацией

**git config --list** - можно проверить данные

**5.git status** - статус наших изменений

---

**6.git branch <branch_name>** - создаем новую ветку

**git branch -d <name_branch>** - удаляем ветку

**7.git checkout <branch_name>** - перейти в вектку

**8.git merge <branch_merge>** -  слияние ветки в текущую ветку

---

**git remote <url> - связаться с удаленным репо**

git branch -M main

git push -u origin main

---

**git clone** <url> - копировать файлы с сайта (и можно дописать “имя папки!” для ее создания

и создать новую ветку, для работы в ней и сдачи её на проверку

**git push** - толкать

**git pull** - тянуть

**git branch**

**git push**