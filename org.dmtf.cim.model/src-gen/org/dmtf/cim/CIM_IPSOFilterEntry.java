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
package org.dmtf.cim;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM IPSO Filter Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An IPSOFilterEntry is used to match traffic based on the IP Security Options header values (ClassificationLevel and ProtectionAuthority) as defined in RFC1108. This type of FilterEntry is used to adjust the IPsec encryption level according to the IPSO classification of the traffic (e.g., secret, confidential, restricted, etc.).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IPSOFilterEntry#getMatchConditionType <em>Match Condition Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPSOFilterEntry#getClassificationLevel <em>Classification Level</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPSOFilterEntry#getOtherClassificationLevel <em>Other Classification Level</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPSOFilterEntry#getProtectionAuthorities <em>Protection Authorities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPSOFilterEntry#getOtherProtectionAuthorities <em>Other Protection Authorities</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IPSOFilterEntry()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Network::Filtering' MappingStrings='[\"IPSP Policy Model.IETF|IPSOFilterEntry\"]' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_IPSOFilterEntry extends CIM_FilterEntryBase {
	/**
	 * Returns the value of the '<em><b>Match Condition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MatchConditionType specifies whether to match based on traffic classification level, protection authority or both. Note that this enumeration is modified from its definition in the IETF's IPSP Policy Model to allow for both classification level and protection authority checking, and to allow the enumerated value, "Other", to be added in the future.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Match Condition Type</em>' attribute.
	 * @see #setMatchConditionType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPSOFilterEntry_MatchConditionType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"2\",\"3\",\"4\"]' Values='[\"Classification Level\",\"Protection Authority\",\"Both Classification Level and Protection Authority\"]' MappingStrings='[\"IPSP Policy Model.IETF|IPSOFilterEntry.MatchConditionType\"]' ModelCorrespondence='[\"CIM_IPSOFilterEntry.ClassificationLevel\",\"CIM_IPSOFilterEntry.ProtectionAuthorities\"]'"
	 * @generated
	 */
	Integer getMatchConditionType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPSOFilterEntry#getMatchConditionType <em>Match Condition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Condition Type</em>' attribute.
	 * @see #getMatchConditionType()
	 * @generated
	 */
	void setMatchConditionType(Integer value);

	/**
	 * Returns the value of the '<em><b>Classification Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the value to be matched when MatchConditionType is 1 or 3 - meaning that "Classification Level" should be filtered. In RFC1108, the following semantics are specified: TopSecret, Secret, Confidential, and Unclassified. Note that this enumeration's values are different than the RFC list and the IETF's IPSP Policy Model since those lists are simply bit maps, and do not include specific values for "Other" or "No Filtering".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classification Level</em>' attribute.
	 * @see #setClassificationLevel(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPSOFilterEntry_ClassificationLevel()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Other\",\"No Filtering on Classification Level\",\"Top Secret\",\"Secret\",\"Confidential\",\"Unclassified\",\"DMTF Reserved\",\"Vendor Reserved\"]' MappingStrings='[\"IPSP Policy Model.IETF|IPSOFilterEntry.MatchConditionValue\",\"RFC1108.IETF|Section 2.3\"]' ModelCorrespondence='[\"CIM_IPSOFilterEntry.MatchConditionType\",\"CIM_IPSOFilterEntry.OtherClassificationLevel\"]'"
	 * @generated
	 */
	Integer getClassificationLevel();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPSOFilterEntry#getClassificationLevel <em>Classification Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Level</em>' attribute.
	 * @see #getClassificationLevel()
	 * @generated
	 */
	void setClassificationLevel(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Classification Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the level when the value 1 ("Other") is specified for the property, ClassificationLevel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Classification Level</em>' attribute.
	 * @see #setOtherClassificationLevel(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPSOFilterEntry_OtherClassificationLevel()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_IPSOFilterEntry.ClassificationLevel\"]'"
	 * @generated
	 */
	String getOtherClassificationLevel();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPSOFilterEntry#getOtherClassificationLevel <em>Other Classification Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Classification Level</em>' attribute.
	 * @see #getOtherClassificationLevel()
	 * @generated
	 */
	void setOtherClassificationLevel(String value);

	/**
	 * Returns the value of the '<em><b>Protection Authorities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the values to be matched when MatchConditionType is 2 or 3 - meaning that "Protection Authority" should be filtered. In RFC1108, the following authorities are specified: GENSER, SIOP-ESI, SCI, NSA and DOE. Note that multiple authorities may be specified. 
	 * 
	 * This enumeration is modified from its definition in the RFC and IETF's IPSP Policy Model. Those lists are simply bit maps, and do not include specific values for "Other" or "No Filtering".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protection Authorities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_IPSOFilterEntry_ProtectionAuthorities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Required='true' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"0x8000..\"]' Values='[\"Other\",\"No Filtering on Protection Authority\",\"GENSER\",\"SIOP-ESI\",\"SCI\",\"NSA\",\"DOE\",\"DMTF Reserved\",\"Vendor Reserved\"]' MappingStrings='[\"IPSP Policy Model.IETF|IPSOFilterEntry.MatchConditionValue\",\"RFC1108.IETF|Section 2.4\"]' ModelCorrespondence='[\"CIM_IPSOFilterEntry.MatchConditionType\",\"CIM_IPSOFilterEntry.OtherProtectionAuthorities\"]'"
	 * @generated
	 */
	EList<Integer> getProtectionAuthorities();

	/**
	 * Returns the value of the '<em><b>Other Protection Authorities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the authority when the value 1 ("Other") is specified for the property, ProtectionAuthorities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Protection Authorities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_IPSOFilterEntry_OtherProtectionAuthorities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_IPSOFilterEntry.ProtectionAuthorities\"]'"
	 * @generated
	 */
	EList<String> getOtherProtectionAuthorities();

} // CIM_IPSOFilterEntry
