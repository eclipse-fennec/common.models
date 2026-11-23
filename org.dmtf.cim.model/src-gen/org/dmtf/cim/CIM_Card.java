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
 * A representation of the model object '<em><b>CIM Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Card class represents a type of physical container that can be plugged into another Card or HostingBoard, or is itself a HostingBoard/Motherboard in a Chassis. The CIM_Card class includes any package capable of carrying signals and providing a mounting point for PhysicalComponents, such as Chips, or other PhysicalPackages, such as other Cards.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Card#getHostingBoard <em>Hosting Board</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Card#getSlotLayout <em>Slot Layout</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Card#getRequiresDaughterBoard <em>Requires Daughter Board</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Card#getSpecialRequirements <em>Special Requirements</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Card#getRequirementsDescription <em>Requirements Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Card#getOperatingVoltages <em>Operating Voltages</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Card()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.55.0' UMLPackagePath='CIM::Physical::Package' keys='Tag,CreationClassName'"
 * @generated
 */
@ProviderType
public interface CIM_Card extends CIM_PhysicalPackage {
	/**
	 * Returns the value of the '<em><b>Hosting Board</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating that this Card is a Motherboard or, more generically, a baseboard in a Chassis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hosting Board</em>' attribute.
	 * @see #setHostingBoard(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_Card_HostingBoard()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getHostingBoard();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Card#getHostingBoard <em>Hosting Board</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hosting Board</em>' attribute.
	 * @see #getHostingBoard()
	 * @generated
	 */
	void setHostingBoard(Boolean value);

	/**
	 * Returns the value of the '<em><b>Slot Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SlotLayout is a free-form string that describes the slot positioning, typical usage, restrictions, individual slot spacings or any other pertinent information for the slots on a Card.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Slot Layout</em>' attribute.
	 * @see #setSlotLayout(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Card_SlotLayout()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getSlotLayout();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Card#getSlotLayout <em>Slot Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot Layout</em>' attribute.
	 * @see #getSlotLayout()
	 * @generated
	 */
	void setSlotLayout(String value);

	/**
	 * Returns the value of the '<em><b>Requires Daughter Board</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating that at least one daughterboard or auxiliary Card is required in order to function properly.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requires Daughter Board</em>' attribute.
	 * @see #setRequiresDaughterBoard(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_Card_RequiresDaughterBoard()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getRequiresDaughterBoard();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Card#getRequiresDaughterBoard <em>Requires Daughter Board</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires Daughter Board</em>' attribute.
	 * @see #getRequiresDaughterBoard()
	 * @generated
	 */
	void setRequiresDaughterBoard(Boolean value);

	/**
	 * Returns the value of the '<em><b>Special Requirements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating that this Card is physically unique from other Cards of the same type and therefore requires a special Slot. For example, a double-wide Card requires two Slots. Another example is where a certain Card may be used for the same general function as other Cards but requires a special Slot (e.g., extra long), whereas the other Cards can be placed in any available Slot. If set to TRUE, then the corresponding property, RequirementsDescription, should specify the nature of the uniqueness or purpose of the Card.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Special Requirements</em>' attribute.
	 * @see #setSpecialRequirements(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_Card_SpecialRequirements()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_Card.RequirementsDescription\"]'"
	 * @generated
	 */
	Boolean getSpecialRequirements();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Card#getSpecialRequirements <em>Special Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special Requirements</em>' attribute.
	 * @see #getSpecialRequirements()
	 * @generated
	 */
	void setSpecialRequirements(Boolean value);

	/**
	 * Returns the value of the '<em><b>Requirements Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string describing the way(s) in which this Card is physically unique from other Cards. This property only has meaning when the corresponding boolean property, SpecialRequirements, is set to TRUE.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirements Description</em>' attribute.
	 * @see #setRequirementsDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Card_RequirementsDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_Card.SpecialRequirements\"]'"
	 * @generated
	 */
	String getRequirementsDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Card#getRequirementsDescription <em>Requirements Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements Description</em>' attribute.
	 * @see #getRequirementsDescription()
	 * @generated
	 */
	void setRequirementsDescription(String value);

	/**
	 * Returns the value of the '<em><b>Operating Voltages</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Operating voltages required by the Card.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operating Voltages</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Card_OperatingVoltages()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='sint16[]' Units='MilliVolts' PUnit='volt * 10^-3'"
	 * @generated
	 */
	EList<Integer> getOperatingVoltages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method manipulates the power to a PhysicalConnector on a Card. It is intended to be used by a Card (especially by a motherboard - i.e., HostingBoard=TRUE) to turn the power on and off for a specific PhysicalConnector located on it. For example, in a personal computer, a system slot does not know how to turn itself on and off. However, the motherboard hosting this slot may have that capability. This is important in order to support hot swapping of an adapter card in a system slot. The method should return 0 if successful, 1 if the request is not supported, and some other value if any other error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	 * @param Connector The connector to change the power setting for.
	 * @param PoweredOn If TRUE, turn power on for the connector. If FALSE, turn power off.
	 * <!-- end-model-doc -->
	 * @model ConnectorAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_PhysicalConnector REF' In='true'" PoweredOnAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long ConnectorPower(CIM_PhysicalConnector Connector, Boolean PoweredOn);

} // CIM_Card
