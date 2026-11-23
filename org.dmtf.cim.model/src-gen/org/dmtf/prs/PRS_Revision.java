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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PRS Revision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PRS_Revision records changes to the content.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.prs.PRS_Revision#getRevisionDate <em>Revision Date</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Revision#getActivityName <em>Activity Name</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Revision#getActivityType <em>Activity Type</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Revision#getTechnicalStatus <em>Technical Status</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Revision#getEditorialStatus <em>Editorial Status</em>}</li>
 * </ul>
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_Revision()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='PRS::Support' override.Description='string' override.Description.Description='Text description of what was done in this revision.' keys='PRSUniqueName'"
 * @generated
 */
@ProviderType
public interface PRS_Revision extends PRS_ExchangeElement {
	/**
	 * Returns the value of the '<em><b>Revision Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date of this revision.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Revision Date</em>' attribute.
	 * @see #setRevisionDate(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Revision_RevisionDate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getRevisionDate();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Revision#getRevisionDate <em>Revision Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Date</em>' attribute.
	 * @see #getRevisionDate()
	 * @generated
	 */
	void setRevisionDate(String value);

	/**
	 * Returns the value of the '<em><b>Activity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the specific revision being made.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Name</em>' attribute.
	 * @see #setActivityName(Integer)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Revision_ActivityName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ValueMap='[\"0\",\"1\",\"2\",\"254\",\"255\"]' Values='[\"Create\",\"Update\",\"Delete\",\"Other\",\"Unknown\"]'"
	 * @generated
	 */
	Integer getActivityName();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Revision#getActivityName <em>Activity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Name</em>' attribute.
	 * @see #getActivityName()
	 * @generated
	 */
	void setActivityName(Integer value);

	/**
	 * Returns the value of the '<em><b>Activity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of revision activity. 'Technical' refers to a change in content. 'Editorial' refers to a change in language or style. 'Administrative' refers to information about the object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Type</em>' attribute.
	 * @see #setActivityType(Integer)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Revision_ActivityType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ValueMap='[\"0\",\"1\",\"2\",\"254\",\"255\"]' Values='[\"Technical\",\"Editorial\",\"Administrative\",\"Other\",\"Unknown\"]'"
	 * @generated
	 */
	Integer getActivityType();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Revision#getActivityType <em>Activity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Type</em>' attribute.
	 * @see #getActivityType()
	 * @generated
	 */
	void setActivityType(Integer value);

	/**
	 * Returns the value of the '<em><b>Technical Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current state of technical review. 'Open' means created but not necessarily completed or resolved. 'Not Reviewed' means contents have to be reviewed for accuracy and consistency with other content. 'Reviewed' means review has been completed. 'Approved' means formally approval to certify the solution given the specific status of the contents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Technical Status</em>' attribute.
	 * @see #setTechnicalStatus(Integer)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Revision_TechnicalStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"254\",\"255\"]' Values='[\"Open\",\"Not Reviewed\",\"Reviewed\",\"Approved\",\"Other\",\"Unknown\"]'"
	 * @generated
	 */
	Integer getTechnicalStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Revision#getTechnicalStatus <em>Technical Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technical Status</em>' attribute.
	 * @see #getTechnicalStatus()
	 * @generated
	 */
	void setTechnicalStatus(Integer value);

	/**
	 * Returns the value of the '<em><b>Editorial Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current state of editorial review. 'In Progress' means the content is in the process of being developed. 'Draft' means the content is complete but unedited. 'Reviewed' means the review has been completed. 'Published' means the contents have been released.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Editorial Status</em>' attribute.
	 * @see #setEditorialStatus(Integer)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Revision_EditorialStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"254\",\"255\"]' Values='[\"In_Progress\",\"Draft\",\"Reviewed\",\"Published\",\"Other\",\"Unknown\"]'"
	 * @generated
	 */
	Integer getEditorialStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Revision#getEditorialStatus <em>Editorial Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editorial Status</em>' attribute.
	 * @see #getEditorialStatus()
	 * @generated
	 */
	void setEditorialStatus(Integer value);

} // PRS_Revision
