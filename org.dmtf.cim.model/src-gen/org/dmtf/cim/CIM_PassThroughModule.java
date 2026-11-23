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
 * A representation of the model object '<em><b>CIM Pass Through Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A device that is a replacement for physical cables and allows internal network physical ports in a chassis or rack to be made accessible from the external network. This may a fixed internal port to external port relationship, or a configurable mapping of internal ports to output ports via a cross-point switching function. The mapping between an internal and external port is modeled using the InternalPorts and ExternalPorts array properties. Corresponding array indices of the InternalPorts and ExternalPorts properties shall contain the port number of the internal port and external port, respectively in a mapping pair. Usage of this class is appropriate when modeling a simple n x n pass through module where the protocols supported by the module are not the target of management. Implementations wishing to enable management of the network function should instrument the appropriate device and network models. The tie into the device and network models is accomplished by correlating the port numbers in this class' internal and external port arrays with CIM_NetworkPort's PortNumber property. The following is an example of how this class could be used: 
 * For a given instance, the value of NumberOfPorts is 3. This indicates that there are 3 internal ports and 3 external ports. Internal port 2 is mapped to external port 3. Internal ports 1 and 3 are not mapped to an external port. External ports 1 and 2 are not mapped to internal ports. For this instance the length of the InternalPorts and ExternalPorts arrays shall both be one. The first array position in InternalPortshall contain the value 2. The first array position in ExternalPorts shall contain the value 3.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PassThroughModule#getLinkTechnologies <em>Link Technologies</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PassThroughModule#getOtherLinkTechnologies <em>Other Link Technologies</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PassThroughModule#getIsProgrammable <em>Is Programmable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PassThroughModule#getNumberOfPorts <em>Number Of Ports</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PassThroughModule#getInternalPorts <em>Internal Ports</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PassThroughModule#getExternalPorts <em>External Ports</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PassThroughModule()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Device::Controller' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_PassThroughModule extends CIM_LogicalModule {
	/**
	 * Returns the value of the '<em><b>Link Technologies</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration of the link technologies that can be passed- through by this device. When set to 1 ("Other"), the property OtherLinkTechnologies contains string descriptions of the alternative link types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Technologies</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PassThroughModule_LinkTechnologies()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"Ethernet\",\"IB\",\"FC\",\"FDDI\",\"ATM\",\"Token Ring\",\"Frame Relay\",\"Infrared\",\"BlueTooth\",\"Wireless LAN\",\"DMTF Reserved\",\"Vendor Specified\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_PassThroughModule.OtherLinkTechnologies\"]'"
	 * @generated
	 */
	EList<Integer> getLinkTechnologies();

	/**
	 * Returns the value of the '<em><b>Other Link Technologies</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of string values describing the supported technologies when an entry in the LinkTechnologies array is set to 1, "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Link Technologies</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PassThroughModule_OtherLinkTechnologies()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_PassThroughModule.LinkTechnologies\"]'"
	 * @generated
	 */
	EList<String> getOtherLinkTechnologies();

	/**
	 * Returns the value of the '<em><b>Is Programmable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating if the port assignments on this switch are software programmable or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Programmable</em>' attribute.
	 * @see #setIsProgrammable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PassThroughModule_IsProgrammable()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIsProgrammable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PassThroughModule#getIsProgrammable <em>Is Programmable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Programmable</em>' attribute.
	 * @see #getIsProgrammable()
	 * @generated
	 */
	void setIsProgrammable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Number Of Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A PassThroughModule is a simple module with 1-1 correspondence between internal and external ports. This number represents the number of external ports. By virtue of there being a 1-1 correspondence of ports, it also represents the number of internal ports. 
	 * The ports are numbered 1 through N.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Ports</em>' attribute.
	 * @see #setNumberOfPorts(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PassThroughModule_NumberOfPorts()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getNumberOfPorts();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PassThroughModule#getNumberOfPorts <em>Number Of Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Ports</em>' attribute.
	 * @see #getNumberOfPorts()
	 * @generated
	 */
	void setNumberOfPorts(Integer value);

	/**
	 * Returns the value of the '<em><b>Internal Ports</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An indexed array containing the internal port numbers. Corresponding external ports are in the ExternalPorts array. Only internal ports which are mapped to an external port shall appear in the array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Internal Ports</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PassThroughModule_InternalPorts()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_PassThroughModule.ExternalPorts\",\"CIM_NetworkPort.PortNumber\"]'"
	 * @generated
	 */
	EList<Integer> getInternalPorts();

	/**
	 * Returns the value of the '<em><b>External Ports</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An indexed array containing the external ports. Corresponding internal ports are in the InternalPorts array. Only external ports which are mapped to an internal port shall appear in the array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Ports</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PassThroughModule_ExternalPorts()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_PassThroughModule.InternalPorts\",\"CIM_NetworkPort.PortNumber\"]'"
	 * @generated
	 */
	EList<Integer> getExternalPorts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the switch is software programmable, then this method is called to assign an internal port to an external port. 
	 * If 0 is returned, the requested status of the mapping of InternalPort and ExternalPort is in effect. That is, an attempt to unmap two ports that are not mapped to any other ports or an attempt to map two ports which are already mapped to each other shall return 0, because the resultant state of the mapping is equivalent to the client request. For a mapping operation, if either target port is already mapped to a different port, the implementation shall first unmap it. An attempt to unmap two ports that are not mapped to each other shall fail with an error of "Not Mapped".
	 * @param Mapped Boolean indicating if the ports are to be unmapped or mapped. If "True", InternalPorts and ExternalPorts shall be updated to contain a mapping of InternalPort to ExternalPort. If "False", InternalPorts and ExternalPorts shall be updated to remove the mapping if one exists.
	 * @param InternalPort The mapping for this internal port shall be updated.
	 * @param ExternalPort The mapping for this external port shall be updated.
	 * <!-- end-model-doc -->
	 * @model MappedAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' In='true'" InternalPortAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true'" ExternalPortAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown/Unspecified Error\",\"Busy\",\"Not Mapped\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long AssignPorts(Boolean Mapped, Integer InternalPort, Integer ExternalPort);

} // CIM_PassThroughModule
