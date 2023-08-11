package com.example.encapsulation.boot;

import com.example.encapsulation.app.GitHub;

public class GitHubMain {
	public static void main(String[] args) {
		GitHub github = new GitHub();

		github.setUsername("Akash");
		System.out.println(github.getUsername());

		github.setFastname("Akash");
		System.out.println(github.getFastname());

		github.setAge(22);
		System.out.println(github.getAge());

		github.setEmail("akash@gmail.com");
		System.out.println(github.getEmail());

		github.setVersion("11.4cc");
		System.out.println(github.getVersion());

		github.setForks("Forks ");
		System.out.println(github.getForks());

		github.setBranches("sefely experiment ");
		System.out.println(github.getBranches());

		github.setWorkflow("Workflow ");
		System.out.println(github.getWorkflow());

		github.setGithubpage("Githubpage ");
		System.out.println(github.getGithubpage());

		github.setSecurity("Security ");
		System.out.println(github.getSecurity());

		github.setNavigate("Navigate");
		System.out.println(github.getNavigate());

		github.setAccount("avi");
		System.out.println(github.getAccount());

		github.setCodereview("Codereview ");
		System.out.println(github.getCodereview());

		github.setSocial("Social");
		System.out.println(github.getSocial());
	}
}
