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
 * A representation of the model object '<em><b>PRS Administrative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PRS_Administrative defines administrative information about associated objects. There must be at least one PRS_Administrative instance associated with a PRS_Solution. Administrative information is inherited from a parent object. 
 * 
 * If the administrative information among objects within a Solution is not the same, additional PRS_Administrative instances may be associated with other objects within the Solution. All instances under a specific parent inherit their administrative information unless there is an PRS_Administrative instance associated with that instance. 
 * 
 * For example, if there is a PRS_Administrative instance associated with a PRS_Problem instance, all of the PRS_Statement and PRS_ Product instances within the Problem use the same Administrative information as the PRS_Problem instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.prs.PRS_Administrative#getComplianceLevel <em>Compliance Level</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Administrative#getDocumentStatus <em>Document Status</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Administrative#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Administrative#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Administrative#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Administrative#getDisclaimer <em>Disclaimer</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Administrative#getRights <em>Rights</em>}</li>
 * </ul>
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_Administrative()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='PRS::Support' keys='PRSUniqueName'"
 * @generated
 */
@ProviderType
public interface PRS_Administrative extends PRS_ExchangeElement {
	/**
	 * Returns the value of the '<em><b>Compliance Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Level 0 means all information within a Reference, Problem or Resolution is conveyed by a single PRS_Statement. 
	 * 
	 * Level 1 means there may be multiple PRS_Statement instances within a Reference, Problem or Resolution. 
	 * 
	 * Level 2 means that a PRS_Statement may be associated with a PRS_Feature instance within a Reference, Problem or Resolution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compliance Level</em>' attribute.
	 * @see #setComplianceLevel(Integer)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Administrative_ComplianceLevel()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\"]'"
	 * @generated
	 */
	Integer getComplianceLevel();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Administrative#getComplianceLevel <em>Compliance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compliance Level</em>' attribute.
	 * @see #getComplianceLevel()
	 * @generated
	 */
	void setComplianceLevel(Integer value);

	/**
	 * Returns the value of the '<em><b>Document Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Editorial status of the document. If 'Draft', information is complete, but unedited. If 'Reviewed', an editorial review has been completed. If 'Published', information has been reviewed and approved for distribution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Status</em>' attribute.
	 * @see #setDocumentStatus(Integer)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Administrative_DocumentStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ValueMap='[\"0\",\"1\",\"2\",\"254\",\"255\"]' Values='[\"Draft\",\"Reviewed\",\"Published\",\"Other\",\"Unknown\"]'"
	 * @generated
	 */
	Integer getDocumentStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Administrative#getDocumentStatus <em>Document Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Status</em>' attribute.
	 * @see #getDocumentStatus()
	 * @generated
	 */
	void setDocumentStatus(Integer value);

	/**
	 * Returns the value of the '<em><b>Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Intended distribution audience for the associated information. If 'Proprietary', information contains proprietary information and is not to be released externally. If 'Internal', information is for internal use only. If 'Partner', information is only available to contracted partners. If 'Public', information is available to anyone.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Distribution</em>' attribute.
	 * @see #setDistribution(Integer)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Administrative_Distribution()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"254\",\"255\"]' Values='[\"Proprietary\",\"Internal\",\"Partner\",\"Public\",\"Other\",\"Unknown\"]'"
	 * @generated
	 */
	Integer getDistribution();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Administrative#getDistribution <em>Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution</em>' attribute.
	 * @see #getDistribution()
	 * @generated
	 */
	void setDistribution(Integer value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Language used in the associated information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Administrative_Language()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Administrative#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Copyright for the associated information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copyright</em>' attribute.
	 * @see #setCopyright(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Administrative_Copyright()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getCopyright();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Administrative#getCopyright <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' attribute.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(String value);

	/**
	 * Returns the value of the '<em><b>Disclaimer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Disclaimers about the associated information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disclaimer</em>' attribute.
	 * @see #setDisclaimer(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Administrative_Disclaimer()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getDisclaimer();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Administrative#getDisclaimer <em>Disclaimer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disclaimer</em>' attribute.
	 * @see #getDisclaimer()
	 * @generated
	 */
	void setDisclaimer(String value);

	/**
	 * Returns the value of the '<em><b>Rights</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Usage rights for the associated information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rights</em>' attribute.
	 * @see #setRights(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Administrative_Rights()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getRights();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Administrative#getRights <em>Rights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rights</em>' attribute.
	 * @see #getRights()
	 * @generated
	 */
	void setRights(String value);

} // PRS_Administrative
