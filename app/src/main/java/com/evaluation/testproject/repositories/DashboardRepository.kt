package com.evaluation.testproject.repositories

import com.evaluation.testproject.listeners.RepositoryListener


class DashboardRepository(private val repositoryListener: RepositoryListener) :
    BaseRepository(repositoryListener) {

}