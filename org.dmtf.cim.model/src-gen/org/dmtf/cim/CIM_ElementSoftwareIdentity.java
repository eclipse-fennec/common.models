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
 * A representation of the model object '<em><b>CIM Element Software Identity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ElementSoftwareIdentity allows a Managed Element to report its software related asset information (firmware, drivers, configuration software, and etc.)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ElementSoftwareIdentity#getUpgradeCondition <em>Upgrade Condition</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ElementSoftwareIdentity#getOtherUpgradeCondition <em>Other Upgrade Condition</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ElementSoftwareIdentity#getElementSoftwareStatus <em>Element Software Status</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ElementSoftwareIdentity()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.20.0' UMLPackagePath='CIM::Core::Software' override.Antecedent='CIM_SoftwareIdentity REF' override.Antecedent.Description='A LogicalElement\'s Software Asset.' override.Dependent='CIM_ManagedElement REF' override.Dependent.Description='The ManagedElement that requires or uses the software.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ElementSoftwareIdentity extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>Upgrade Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the element's ability to upgrade this software asset.
	 * 'Resides off element'(2), indicates the persistence of the software is outside of the element. Typically for a element this software is part of the OperatingSystem is typically upgradeable.
	 * 'Owner Upgradeable' (3), indicates the persistence of the software is on the element and is upgradeable by the owner.
	 * 'FactoryUpgradeable' (4),indicates the persistence of the software is on the element and is upgradeable by the manufacturer.
	 * 'Not Upgradeable' (5), indicates the presistence of the software is on the element and is not upgradeable. (i.e. burned into a non replaceable ROM chip.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upgrade Condition</em>' attribute.
	 * @see #setUpgradeCondition(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ElementSoftwareIdentity_UpgradeCondition()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Unknown\",\"Other\",\"Resides off device\",\"Owner Upgradeable\",\"Factory Upgradeable\",\"Not Upgradeable\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_ElementSoftwareIdentity.OtherUpgradeCondition\"]'"
	 * @generated
	 */
	Integer getUpgradeCondition();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ElementSoftwareIdentity#getUpgradeCondition <em>Upgrade Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upgrade Condition</em>' attribute.
	 * @see #getUpgradeCondition()
	 * @generated
	 */
	void setUpgradeCondition(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Upgrade Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the upgrade condition, when UpgradeCondition is set to 1 ("Other").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Upgrade Condition</em>' attribute.
	 * @see #setOtherUpgradeCondition(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ElementSoftwareIdentity_OtherUpgradeCondition()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_ElementSoftwareIdentity.UpgradeCondition\"]'"
	 * @generated
	 */
	String getOtherUpgradeCondition();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ElementSoftwareIdentity#getOtherUpgradeCondition <em>Other Upgrade Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Upgrade Condition</em>' attribute.
	 * @see #getOtherUpgradeCondition()
	 * @generated
	 */
	void setOtherUpgradeCondition(String value);

	/**
	 * Returns the value of the '<em><b>Element Software Status</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of properties describing the status of the software on the managed element. Multiple properties could be set at the same time. For example a ElementSoftwareStatus could have "Installed", "Default", "Current" and "FallBack" set at the same time. 
	 * "Current" indicates that the software is currently running on or for the Managed Element. 
	 * "Next" indicates that the software will run after the next reset or reboot unless superseded by a software with a status of "SingleUse". 
	 * "FallBack" indicates that the software will be run if the software which has a status of "Next" or "SingleUse" fails to run. 
	 * "Default" indicates the default version of the software that was originally shipped by the manufacturer. 
	 * "Installed" indicates that the software is persistently located and is available for use on the Managed Element. 
	 * "SingleUse" indicates that the software will run only after the next reset or reboot but will not run after the subsequent reset or reboot. 
	 * "Available" indicates that the software is available for installation on the Managed Element. 
	 * "Supports"indicates that the software will work with or operate the Managed Element but is or will be installed on a different Managed Element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Software Status</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ElementSoftwareIdentity_ElementSoftwareStatus()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Current\",\"Next\",\"FallBack\",\"Default\",\"Installed\",\"Single Use\",\"Available\",\"Supports\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getElementSoftwareStatus();

} // CIM_ElementSoftwareIdentity
