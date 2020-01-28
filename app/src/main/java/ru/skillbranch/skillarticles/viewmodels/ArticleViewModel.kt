package ru.skillbranch.skillarticles.viewmodels

import androidx.lifecycle.LiveData
import ru.skillbranch.skillarticles.data.ArticleData
import ru.skillbranch.skillarticles.data.ArticlePersonalInfo

class ArticleViewModel: IArticleViewModel {
    override fun getArticleContent(): LiveData<List<Any>?> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getArticleData(): LiveData<ArticleData?> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getArticlePersonalInfo(): LiveData<ArticlePersonalInfo?> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun handleNightMode() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun handleUpText() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun handleDownText() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun handleBookmark() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun handleLike() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun handleShare() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun handleToggleMenu() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun handleSearchMode(isSearch: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun handleSearch(query: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
