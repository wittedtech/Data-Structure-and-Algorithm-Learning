
The following command will add your local project to github.

git init
git add .
git commit -m "Comment here"
git remote add origin https://github.com/YourRepoPrefixHere.git
git push -u origin master



merge master branch into main

git:(master) git branch main
git:(master) git checkout main
git:(main) git pull origin master
git:(main) git checkout master
git:(master) git pull

git pull --rebase
git push --set-upstream origin main
git push -f origin main

