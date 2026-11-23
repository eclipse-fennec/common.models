/**
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.prs.impl;

import org.dmtf.prs.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrsFactoryImpl extends EFactoryImpl implements PrsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrsFactory init() {
		try {
			PrsFactory thePrsFactory = (PrsFactory)EPackage.Registry.INSTANCE.getEFactory(PrsPackage.eNS_URI);
			if (thePrsFactory != null) {
				return thePrsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PrsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PrsPackage.PRS_FEATURE: return createPRS_Feature();
			case PrsPackage.PRS_LOCATION: return createPRS_Location();
			case PrsPackage.PRS_PRODUCT: return createPRS_Product();
			case PrsPackage.PRS_RESOURCE: return createPRS_Resource();
			case PrsPackage.PRS_REVISION: return createPRS_Revision();
			case PrsPackage.PRS_SERVICE_INCIDENT: return createPRS_ServiceIncident();
			case PrsPackage.PRS_SOLUTION: return createPRS_Solution();
			case PrsPackage.PRS_STATEMENT: return createPRS_Statement();
			case PrsPackage.PRS_TRANSACTION: return createPRS_Transaction();
			case PrsPackage.PRS_ACTIVITY: return createPRS_Activity();
			case PrsPackage.PRS_ACTIVITY_RESOURCE: return createPRS_ActivityResource();
			case PrsPackage.PRS_ACTIVITY_TRANSACTION: return createPRS_ActivityTransaction();
			case PrsPackage.PRS_ADDRESS: return createPRS_Address();
			case PrsPackage.PRS_ADDRESS_LOCATION: return createPRS_AddressLocation();
			case PrsPackage.PRS_ADMINISTRATIVE: return createPRS_Administrative();
			case PrsPackage.PRS_ADMINISTRATIVE_REVISION: return createPRS_AdministrativeRevision();
			case PrsPackage.PRS_AGREEMENT: return createPRS_Agreement();
			case PrsPackage.PRS_ATTACHMENT: return createPRS_Attachment();
			case PrsPackage.PRS_CATEGORY: return createPRS_Category();
			case PrsPackage.PRS_CATEGORY_PARENT_CHILD: return createPRS_CategoryParentChild();
			case PrsPackage.PRS_CONTACT: return createPRS_Contact();
			case PrsPackage.PRS_CONTACT_ITEM_ADDRESS: return createPRS_ContactItemAddress();
			case PrsPackage.PRS_EXPRESSION: return createPRS_Expression();
			case PrsPackage.PRS_EXPRESSION_LINK: return createPRS_ExpressionLink();
			case PrsPackage.PRS_FEATURE_RESOURCE: return createPRS_FeatureResource();
			case PrsPackage.PRS_ORGANIZATION: return createPRS_Organization();
			case PrsPackage.PRS_PERSON: return createPRS_Person();
			case PrsPackage.PRS_PROBLEM: return createPRS_Problem();
			case PrsPackage.PRS_PRODUCT_ASSET: return createPRS_ProductAsset();
			case PrsPackage.PRS_PRODUCT_COMPONENT: return createPRS_ProductComponent();
			case PrsPackage.PRS_PRODUCT_PARENT_CHILD: return createPRS_ProductParentChild();
			case PrsPackage.PRS_REFERENCE: return createPRS_Reference();
			case PrsPackage.PRS_RESOLUTION: return createPRS_Resolution();
			case PrsPackage.PRS_RESOLUTION_RESOURCE: return createPRS_ResolutionResource();
			case PrsPackage.PRS_REVISION_CONTACT: return createPRS_RevisionContact();
			case PrsPackage.PRS_SERVICE_ACTIVITY: return createPRS_ServiceActivity();
			case PrsPackage.PRS_SERVICE_AGREEMENT: return createPRS_ServiceAgreement();
			case PrsPackage.PRS_SERVICE_PROBLEM: return createPRS_ServiceProblem();
			case PrsPackage.PRS_SERVICE_PROVIDER: return createPRS_ServiceProvider();
			case PrsPackage.PRS_SERVICE_REQUESTER: return createPRS_ServiceRequester();
			case PrsPackage.PRS_SERVICE_RESOLUTION_SOLUTION: return createPRS_ServiceResolutionSolution();
			case PrsPackage.PRS_SOLUTION_CATEGORY: return createPRS_SolutionCategory();
			case PrsPackage.PRS_SOLUTION_EXPRESSION: return createPRS_SolutionExpression();
			case PrsPackage.PRS_SOLUTION_PROBLEM: return createPRS_SolutionProblem();
			case PrsPackage.PRS_SOLUTION_REFERENCE: return createPRS_SolutionReference();
			case PrsPackage.PRS_SOLUTION_RESOLUTION: return createPRS_SolutionResolution();
			case PrsPackage.PRS_STATEMENT_FEATURE: return createPRS_StatementFeature();
			case PrsPackage.PRS_ACTIVITY_CONTACT: return createPRS_ActivityContact();
			case PrsPackage.PRS_ADMIN_ASSOCIATION: return createPRS_AdminAssociation();
			case PrsPackage.PRS_ADMINISTRATIVE_CONTACT: return createPRS_AdministrativeContact();
			case PrsPackage.PRS_ATTACHED: return createPRS_Attached();
			case PrsPackage.PRS_CATEGORIZATION: return createPRS_Categorization();
			case PrsPackage.PRS_CONTACT_ORGANIZATION: return createPRS_ContactOrganization();
			case PrsPackage.PRS_CONTACT_PERSON: return createPRS_ContactPerson();
			case PrsPackage.PRS_SIS_SERVICE: return createPRS_SISService();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_Feature createPRS_Feature() {
		PRS_FeatureImpl prS_Feature = new PRS_FeatureImpl();
		return prS_Feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_Location createPRS_Location() {
		PRS_LocationImpl prS_Location = new PRS_LocationImpl();
		return prS_Location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_Product createPRS_Product() {
		PRS_ProductImpl prS_Product = new PRS_ProductImpl();
		return prS_Product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_Resource createPRS_Resource() {
		PRS_ResourceImpl prS_Resource = new PRS_ResourceImpl();
		return prS_Resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_Revision createPRS_Revision() {
		PRS_RevisionImpl prS_Revision = new PRS_RevisionImpl();
		return prS_Revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_ServiceIncident createPRS_ServiceIncident() {
		PRS_ServiceIncidentImpl prS_ServiceIncident = new PRS_ServiceIncidentImpl();
		return prS_ServiceIncident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_Solution createPRS_Solution() {
		PRS_SolutionImpl prS_Solution = new PRS_SolutionImpl();
		return prS_Solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_Statement createPRS_Statement() {
		PRS_StatementImpl prS_Statement = new PRS_StatementImpl();
		return prS_Statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_Transaction createPRS_Transaction() {
		PRS_TransactionImpl prS_Transaction = new PRS_TransactionImpl();
		return prS_Transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_Activity createPRS_Activity() {
		PRS_ActivityImpl prS_Activity = new PRS_ActivityImpl();
		return prS_Activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_ActivityResource createPRS_ActivityResource() {
		PRS_ActivityResourceImpl prS_ActivityResource = new PRS_ActivityResourceImpl();
		return prS_ActivityResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_ActivityTransaction createPRS_ActivityTransaction() {
		PRS_ActivityTransactionImpl prS_ActivityTransaction = new PRS_ActivityTransactionImpl();
		return prS_ActivityTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_Address createPRS_Address() {
		PRS_AddressImpl prS_Address = new PRS_AddressImpl();
		return prS_Address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_AddressLocation createPRS_AddressLocation() {
		PRS_AddressLocationImpl prS_AddressLocation = new PRS_AddressLocationImpl();
		return prS_AddressLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_Administrative createPRS_Administrative() {
		PRS_AdministrativeImpl prS_Administrative = new PRS_AdministrativeImpl();
		return prS_Administrative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_AdministrativeRevision createPRS_AdministrativeRevision() {
		PRS_AdministrativeRevisionImpl prS_AdministrativeRevision = new PRS_AdministrativeRevisionImpl();
		return prS_AdministrativeRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_Agreement createPRS_Agreement() {
		PRS_AgreementImpl prS_Agreement = new PRS_AgreementImpl();
		return prS_Agreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_Attachment createPRS_Attachment() {
		PRS_AttachmentImpl prS_Attachment = new PRS_AttachmentImpl();
		return prS_Attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_Category createPRS_Category() {
		PRS_CategoryImpl prS_Category = new PRS_CategoryImpl();
		return prS_Category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_CategoryParentChild createPRS_CategoryParentChild() {
		PRS_CategoryParentChildImpl prS_CategoryParentChild = new PRS_CategoryParentChildImpl();
		return prS_CategoryParentChild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_Contact createPRS_Contact() {
		PRS_ContactImpl prS_Contact = new PRS_ContactImpl();
		return prS_Contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_ContactItemAddress createPRS_ContactItemAddress() {
		PRS_ContactItemAddressImpl prS_ContactItemAddress = new PRS_ContactItemAddressImpl();
		return prS_ContactItemAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_Expression createPRS_Expression() {
		PRS_ExpressionImpl prS_Expression = new PRS_ExpressionImpl();
		return prS_Expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_ExpressionLink createPRS_ExpressionLink() {
		PRS_ExpressionLinkImpl prS_ExpressionLink = new PRS_ExpressionLinkImpl();
		return prS_ExpressionLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_FeatureResource createPRS_FeatureResource() {
		PRS_FeatureResourceImpl prS_FeatureResource = new PRS_FeatureResourceImpl();
		return prS_FeatureResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_Organization createPRS_Organization() {
		PRS_OrganizationImpl prS_Organization = new PRS_OrganizationImpl();
		return prS_Organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_Person createPRS_Person() {
		PRS_PersonImpl prS_Person = new PRS_PersonImpl();
		return prS_Person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_Problem createPRS_Problem() {
		PRS_ProblemImpl prS_Problem = new PRS_ProblemImpl();
		return prS_Problem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_ProductAsset createPRS_ProductAsset() {
		PRS_ProductAssetImpl prS_ProductAsset = new PRS_ProductAssetImpl();
		return prS_ProductAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_ProductComponent createPRS_ProductComponent() {
		PRS_ProductComponentImpl prS_ProductComponent = new PRS_ProductComponentImpl();
		return prS_ProductComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_ProductParentChild createPRS_ProductParentChild() {
		PRS_ProductParentChildImpl prS_ProductParentChild = new PRS_ProductParentChildImpl();
		return prS_ProductParentChild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_Reference createPRS_Reference() {
		PRS_ReferenceImpl prS_Reference = new PRS_ReferenceImpl();
		return prS_Reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_Resolution createPRS_Resolution() {
		PRS_ResolutionImpl prS_Resolution = new PRS_ResolutionImpl();
		return prS_Resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_ResolutionResource createPRS_ResolutionResource() {
		PRS_ResolutionResourceImpl prS_ResolutionResource = new PRS_ResolutionResourceImpl();
		return prS_ResolutionResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_RevisionContact createPRS_RevisionContact() {
		PRS_RevisionContactImpl prS_RevisionContact = new PRS_RevisionContactImpl();
		return prS_RevisionContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_ServiceActivity createPRS_ServiceActivity() {
		PRS_ServiceActivityImpl prS_ServiceActivity = new PRS_ServiceActivityImpl();
		return prS_ServiceActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_ServiceAgreement createPRS_ServiceAgreement() {
		PRS_ServiceAgreementImpl prS_ServiceAgreement = new PRS_ServiceAgreementImpl();
		return prS_ServiceAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_ServiceProblem createPRS_ServiceProblem() {
		PRS_ServiceProblemImpl prS_ServiceProblem = new PRS_ServiceProblemImpl();
		return prS_ServiceProblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_ServiceProvider createPRS_ServiceProvider() {
		PRS_ServiceProviderImpl prS_ServiceProvider = new PRS_ServiceProviderImpl();
		return prS_ServiceProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_ServiceRequester createPRS_ServiceRequester() {
		PRS_ServiceRequesterImpl prS_ServiceRequester = new PRS_ServiceRequesterImpl();
		return prS_ServiceRequester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_ServiceResolutionSolution createPRS_ServiceResolutionSolution() {
		PRS_ServiceResolutionSolutionImpl prS_ServiceResolutionSolution = new PRS_ServiceResolutionSolutionImpl();
		return prS_ServiceResolutionSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_SolutionCategory createPRS_SolutionCategory() {
		PRS_SolutionCategoryImpl prS_SolutionCategory = new PRS_SolutionCategoryImpl();
		return prS_SolutionCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_SolutionExpression createPRS_SolutionExpression() {
		PRS_SolutionExpressionImpl prS_SolutionExpression = new PRS_SolutionExpressionImpl();
		return prS_SolutionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_SolutionProblem createPRS_SolutionProblem() {
		PRS_SolutionProblemImpl prS_SolutionProblem = new PRS_SolutionProblemImpl();
		return prS_SolutionProblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_SolutionReference createPRS_SolutionReference() {
		PRS_SolutionReferenceImpl prS_SolutionReference = new PRS_SolutionReferenceImpl();
		return prS_SolutionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_SolutionResolution createPRS_SolutionResolution() {
		PRS_SolutionResolutionImpl prS_SolutionResolution = new PRS_SolutionResolutionImpl();
		return prS_SolutionResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_StatementFeature createPRS_StatementFeature() {
		PRS_StatementFeatureImpl prS_StatementFeature = new PRS_StatementFeatureImpl();
		return prS_StatementFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_ActivityContact createPRS_ActivityContact() {
		PRS_ActivityContactImpl prS_ActivityContact = new PRS_ActivityContactImpl();
		return prS_ActivityContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_AdminAssociation createPRS_AdminAssociation() {
		PRS_AdminAssociationImpl prS_AdminAssociation = new PRS_AdminAssociationImpl();
		return prS_AdminAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_AdministrativeContact createPRS_AdministrativeContact() {
		PRS_AdministrativeContactImpl prS_AdministrativeContact = new PRS_AdministrativeContactImpl();
		return prS_AdministrativeContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_Attached createPRS_Attached() {
		PRS_AttachedImpl prS_Attached = new PRS_AttachedImpl();
		return prS_Attached;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_Categorization createPRS_Categorization() {
		PRS_CategorizationImpl prS_Categorization = new PRS_CategorizationImpl();
		return prS_Categorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_ContactOrganization createPRS_ContactOrganization() {
		PRS_ContactOrganizationImpl prS_ContactOrganization = new PRS_ContactOrganizationImpl();
		return prS_ContactOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_ContactPerson createPRS_ContactPerson() {
		PRS_ContactPersonImpl prS_ContactPerson = new PRS_ContactPersonImpl();
		return prS_ContactPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PRS_SISService createPRS_SISService() {
		PRS_SISServiceImpl prS_SISService = new PRS_SISServiceImpl();
		return prS_SISService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrsPackage getPrsPackage() {
		return (PrsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PrsPackage getPackage() {
		return PrsPackage.eINSTANCE;
	}

} //PrsFactoryImpl
