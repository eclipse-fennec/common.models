/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.prs;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.dmtf.prs.PrsPackage
 * @generated
 */
@ProviderType
public interface PrsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PrsFactory eINSTANCE = org.dmtf.prs.impl.PrsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>PRS Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Feature</em>'.
	 * @generated
	 */
	PRS_Feature createPRS_Feature();

	/**
	 * Returns a new object of class '<em>PRS Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Location</em>'.
	 * @generated
	 */
	PRS_Location createPRS_Location();

	/**
	 * Returns a new object of class '<em>PRS Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Product</em>'.
	 * @generated
	 */
	PRS_Product createPRS_Product();

	/**
	 * Returns a new object of class '<em>PRS Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Resource</em>'.
	 * @generated
	 */
	PRS_Resource createPRS_Resource();

	/**
	 * Returns a new object of class '<em>PRS Revision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Revision</em>'.
	 * @generated
	 */
	PRS_Revision createPRS_Revision();

	/**
	 * Returns a new object of class '<em>PRS Service Incident</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Service Incident</em>'.
	 * @generated
	 */
	PRS_ServiceIncident createPRS_ServiceIncident();

	/**
	 * Returns a new object of class '<em>PRS Solution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Solution</em>'.
	 * @generated
	 */
	PRS_Solution createPRS_Solution();

	/**
	 * Returns a new object of class '<em>PRS Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Statement</em>'.
	 * @generated
	 */
	PRS_Statement createPRS_Statement();

	/**
	 * Returns a new object of class '<em>PRS Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Transaction</em>'.
	 * @generated
	 */
	PRS_Transaction createPRS_Transaction();

	/**
	 * Returns a new object of class '<em>PRS Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Activity</em>'.
	 * @generated
	 */
	PRS_Activity createPRS_Activity();

	/**
	 * Returns a new object of class '<em>PRS Activity Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Activity Resource</em>'.
	 * @generated
	 */
	PRS_ActivityResource createPRS_ActivityResource();

	/**
	 * Returns a new object of class '<em>PRS Activity Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Activity Transaction</em>'.
	 * @generated
	 */
	PRS_ActivityTransaction createPRS_ActivityTransaction();

	/**
	 * Returns a new object of class '<em>PRS Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Address</em>'.
	 * @generated
	 */
	PRS_Address createPRS_Address();

	/**
	 * Returns a new object of class '<em>PRS Address Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Address Location</em>'.
	 * @generated
	 */
	PRS_AddressLocation createPRS_AddressLocation();

	/**
	 * Returns a new object of class '<em>PRS Administrative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Administrative</em>'.
	 * @generated
	 */
	PRS_Administrative createPRS_Administrative();

	/**
	 * Returns a new object of class '<em>PRS Administrative Revision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Administrative Revision</em>'.
	 * @generated
	 */
	PRS_AdministrativeRevision createPRS_AdministrativeRevision();

	/**
	 * Returns a new object of class '<em>PRS Agreement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Agreement</em>'.
	 * @generated
	 */
	PRS_Agreement createPRS_Agreement();

	/**
	 * Returns a new object of class '<em>PRS Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Attachment</em>'.
	 * @generated
	 */
	PRS_Attachment createPRS_Attachment();

	/**
	 * Returns a new object of class '<em>PRS Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Category</em>'.
	 * @generated
	 */
	PRS_Category createPRS_Category();

	/**
	 * Returns a new object of class '<em>PRS Category Parent Child</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Category Parent Child</em>'.
	 * @generated
	 */
	PRS_CategoryParentChild createPRS_CategoryParentChild();

	/**
	 * Returns a new object of class '<em>PRS Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Contact</em>'.
	 * @generated
	 */
	PRS_Contact createPRS_Contact();

	/**
	 * Returns a new object of class '<em>PRS Contact Item Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Contact Item Address</em>'.
	 * @generated
	 */
	PRS_ContactItemAddress createPRS_ContactItemAddress();

	/**
	 * Returns a new object of class '<em>PRS Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Expression</em>'.
	 * @generated
	 */
	PRS_Expression createPRS_Expression();

	/**
	 * Returns a new object of class '<em>PRS Expression Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Expression Link</em>'.
	 * @generated
	 */
	PRS_ExpressionLink createPRS_ExpressionLink();

	/**
	 * Returns a new object of class '<em>PRS Feature Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Feature Resource</em>'.
	 * @generated
	 */
	PRS_FeatureResource createPRS_FeatureResource();

	/**
	 * Returns a new object of class '<em>PRS Organization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Organization</em>'.
	 * @generated
	 */
	PRS_Organization createPRS_Organization();

	/**
	 * Returns a new object of class '<em>PRS Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Person</em>'.
	 * @generated
	 */
	PRS_Person createPRS_Person();

	/**
	 * Returns a new object of class '<em>PRS Problem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Problem</em>'.
	 * @generated
	 */
	PRS_Problem createPRS_Problem();

	/**
	 * Returns a new object of class '<em>PRS Product Asset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Product Asset</em>'.
	 * @generated
	 */
	PRS_ProductAsset createPRS_ProductAsset();

	/**
	 * Returns a new object of class '<em>PRS Product Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Product Component</em>'.
	 * @generated
	 */
	PRS_ProductComponent createPRS_ProductComponent();

	/**
	 * Returns a new object of class '<em>PRS Product Parent Child</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Product Parent Child</em>'.
	 * @generated
	 */
	PRS_ProductParentChild createPRS_ProductParentChild();

	/**
	 * Returns a new object of class '<em>PRS Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Reference</em>'.
	 * @generated
	 */
	PRS_Reference createPRS_Reference();

	/**
	 * Returns a new object of class '<em>PRS Resolution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Resolution</em>'.
	 * @generated
	 */
	PRS_Resolution createPRS_Resolution();

	/**
	 * Returns a new object of class '<em>PRS Resolution Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Resolution Resource</em>'.
	 * @generated
	 */
	PRS_ResolutionResource createPRS_ResolutionResource();

	/**
	 * Returns a new object of class '<em>PRS Revision Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Revision Contact</em>'.
	 * @generated
	 */
	PRS_RevisionContact createPRS_RevisionContact();

	/**
	 * Returns a new object of class '<em>PRS Service Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Service Activity</em>'.
	 * @generated
	 */
	PRS_ServiceActivity createPRS_ServiceActivity();

	/**
	 * Returns a new object of class '<em>PRS Service Agreement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Service Agreement</em>'.
	 * @generated
	 */
	PRS_ServiceAgreement createPRS_ServiceAgreement();

	/**
	 * Returns a new object of class '<em>PRS Service Problem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Service Problem</em>'.
	 * @generated
	 */
	PRS_ServiceProblem createPRS_ServiceProblem();

	/**
	 * Returns a new object of class '<em>PRS Service Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Service Provider</em>'.
	 * @generated
	 */
	PRS_ServiceProvider createPRS_ServiceProvider();

	/**
	 * Returns a new object of class '<em>PRS Service Requester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Service Requester</em>'.
	 * @generated
	 */
	PRS_ServiceRequester createPRS_ServiceRequester();

	/**
	 * Returns a new object of class '<em>PRS Service Resolution Solution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Service Resolution Solution</em>'.
	 * @generated
	 */
	PRS_ServiceResolutionSolution createPRS_ServiceResolutionSolution();

	/**
	 * Returns a new object of class '<em>PRS Solution Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Solution Category</em>'.
	 * @generated
	 */
	PRS_SolutionCategory createPRS_SolutionCategory();

	/**
	 * Returns a new object of class '<em>PRS Solution Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Solution Expression</em>'.
	 * @generated
	 */
	PRS_SolutionExpression createPRS_SolutionExpression();

	/**
	 * Returns a new object of class '<em>PRS Solution Problem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Solution Problem</em>'.
	 * @generated
	 */
	PRS_SolutionProblem createPRS_SolutionProblem();

	/**
	 * Returns a new object of class '<em>PRS Solution Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Solution Reference</em>'.
	 * @generated
	 */
	PRS_SolutionReference createPRS_SolutionReference();

	/**
	 * Returns a new object of class '<em>PRS Solution Resolution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Solution Resolution</em>'.
	 * @generated
	 */
	PRS_SolutionResolution createPRS_SolutionResolution();

	/**
	 * Returns a new object of class '<em>PRS Statement Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Statement Feature</em>'.
	 * @generated
	 */
	PRS_StatementFeature createPRS_StatementFeature();

	/**
	 * Returns a new object of class '<em>PRS Activity Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Activity Contact</em>'.
	 * @generated
	 */
	PRS_ActivityContact createPRS_ActivityContact();

	/**
	 * Returns a new object of class '<em>PRS Admin Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Admin Association</em>'.
	 * @generated
	 */
	PRS_AdminAssociation createPRS_AdminAssociation();

	/**
	 * Returns a new object of class '<em>PRS Administrative Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Administrative Contact</em>'.
	 * @generated
	 */
	PRS_AdministrativeContact createPRS_AdministrativeContact();

	/**
	 * Returns a new object of class '<em>PRS Attached</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Attached</em>'.
	 * @generated
	 */
	PRS_Attached createPRS_Attached();

	/**
	 * Returns a new object of class '<em>PRS Categorization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Categorization</em>'.
	 * @generated
	 */
	PRS_Categorization createPRS_Categorization();

	/**
	 * Returns a new object of class '<em>PRS Contact Organization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Contact Organization</em>'.
	 * @generated
	 */
	PRS_ContactOrganization createPRS_ContactOrganization();

	/**
	 * Returns a new object of class '<em>PRS Contact Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS Contact Person</em>'.
	 * @generated
	 */
	PRS_ContactPerson createPRS_ContactPerson();

	/**
	 * Returns a new object of class '<em>PRS SIS Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRS SIS Service</em>'.
	 * @generated
	 */
	PRS_SISService createPRS_SISService();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PrsPackage getPrsPackage();

} //PrsFactory
