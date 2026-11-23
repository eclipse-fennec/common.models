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
 * A representation of the model object '<em><b>PRS Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the date of each transaction and the objects involved.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.prs.PRS_Activity#getParameterList <em>Parameter List</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Activity#getNewKeys <em>New Keys</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Activity#getDeleted <em>Deleted</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Activity#getModified <em>Modified</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Activity#getLocalDate <em>Local Date</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Activity#getActionLog <em>Action Log</em>}</li>
 * </ul>
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_Activity()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='PRS::Support' keys='PRSUniqueName'"
 * @generated
 */
@ProviderType
public interface PRS_Activity extends PRS_ExchangeElement {
	/**
	 * Returns the value of the '<em><b>Parameter List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The key fields for the objects in the associated Transaction. The use of this property is deprecated. The PRS_SISService StartSISTransaction method uses the New, Modified and Deleted properties instead of this field. This field is set to NULL by the StartSISTransaction method if the other properties are used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter List</em>' attribute.
	 * @see #setParameterList(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Activity_ParameterList()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"PRS_Activity.NewKeys\",\"PRS_Activity.Deleted\",\"PRS_Activity.Modified\"]'"
	 * @generated
	 */
	String getParameterList();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Activity#getParameterList <em>Parameter List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter List</em>' attribute.
	 * @see #getParameterList()
	 * @generated
	 */
	void setParameterList(String value);

	/**
	 * Returns the value of the '<em><b>New Keys</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The key fields for the objects added in the associated Transaction. This property is set by the PRS_SISService StartSISTransaction method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>New Keys</em>' attribute.
	 * @see #setNewKeys(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Activity_NewKeys()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getNewKeys();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Activity#getNewKeys <em>New Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Keys</em>' attribute.
	 * @see #getNewKeys()
	 * @generated
	 */
	void setNewKeys(String value);

	/**
	 * Returns the value of the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The key fields for objects deleted in the associated Transaction. This property is set by the PRS_SISService StartSISTransaction method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deleted</em>' attribute.
	 * @see #setDeleted(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Activity_Deleted()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getDeleted();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Activity#getDeleted <em>Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deleted</em>' attribute.
	 * @see #getDeleted()
	 * @generated
	 */
	void setDeleted(String value);

	/**
	 * Returns the value of the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The key fields for objects modified in the associated Transaction. This property is set by the PRS_SISService StartSISTransaction method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modified</em>' attribute.
	 * @see #setModified(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Activity_Modified()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getModified();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Activity#getModified <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' attribute.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(String value);

	/**
	 * Returns the value of the '<em><b>Local Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date of the Activity. This property is set by the PRS_SISService StartSISTranasaction method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Date</em>' attribute.
	 * @see #setLocalDate(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Activity_LocalDate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getLocalDate();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Activity#getLocalDate <em>Local Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Date</em>' attribute.
	 * @see #getLocalDate()
	 * @generated
	 */
	void setLocalDate(String value);

	/**
	 * Returns the value of the '<em><b>Action Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the activity performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Log</em>' attribute.
	 * @see #setActionLog(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Activity_ActionLog()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getActionLog();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Activity#getActionLog <em>Action Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Log</em>' attribute.
	 * @see #getActionLog()
	 * @generated
	 */
	void setActionLog(String value);

} // PRS_Activity
