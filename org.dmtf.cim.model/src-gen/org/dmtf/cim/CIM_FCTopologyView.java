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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM FC Topology View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_TopologyView provides the properties to be able to build a topology without having to do associators from the ProtocolEndpoint to the FCPort to the FCNode or FCSwitch.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FCTopologyView#getAntecedentFCPort <em>Antecedent FC Port</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCTopologyView#getAntecedentSystem <em>Antecedent System</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCTopologyView#getAntecedentFCPortWWN <em>Antecedent FC Port WWN</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCTopologyView#getAntecedentFCPortElementName <em>Antecedent FC Port Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCTopologyView#getAntecedentElementWWN <em>Antecedent Element WWN</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCTopologyView#getAntecedentFCPortType <em>Antecedent FC Port Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCTopologyView#getDependentFCPort <em>Dependent FC Port</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCTopologyView#getDependentSystem <em>Dependent System</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCTopologyView#getDependentFCPortWWN <em>Dependent FC Port WWN</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCTopologyView#getDependentFCPortElementName <em>Dependent FC Port Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCTopologyView#getDependentElementWWN <em>Dependent Element WWN</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCTopologyView#getDependentFCPortType <em>Dependent FC Port Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FCTopologyView()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::Views' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. To ensure uniqueness within the NameSpace, the value of InstanceID should be constructed using the following \'preferred\' algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon \':\', and where &lt;OrgID&gt; must include a unique name. It can be a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID. Or, it could be a registered ID that is assigned to the business entity by a recognized global authority.(This requirement is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt;&gt; structure of Schema class names.) In addition, to ensure uniqueness &lt;OrgID&gt; must not contain a colon (\':\'). When using this algorithm, the first colon to appear in InstanceID must appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the business entity and should not be re-used to identify different underlying (real-world) elements. If the above \'preferred\' algorithm is not used, the defining entity must ensure that the resulting InstanceID is not re-used as any of InstanceIDs produced by this or other providers for the NameSpace of this instance. \nFor DMTF-defined instances, the \'preferred\' algorithm must be used with the &lt;OrgID&gt; set to \'CIM\'.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_FCTopologyView extends CIM_View {
	/**
	 * Returns the value of the '<em><b>Antecedent FC Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The antecedent FCPort that is communicating with the dependent FCPort.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Antecedent FC Port</em>' attribute.
	 * @see #setAntecedentFCPort(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCTopologyView_AntecedentFCPort()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Reference='CIM_FCPort'"
	 * @generated
	 */
	String getAntecedentFCPort();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCTopologyView#getAntecedentFCPort <em>Antecedent FC Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent FC Port</em>' attribute.
	 * @see #getAntecedentFCPort()
	 * @generated
	 */
	void setAntecedentFCPort(String value);

	/**
	 * Returns the value of the '<em><b>Antecedent System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The System of the antecedent FCPort in the AntecedentFCPort SystemDevice association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Antecedent System</em>' attribute.
	 * @see #setAntecedentSystem(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCTopologyView_AntecedentSystem()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Reference='CIM_System'"
	 * @generated
	 */
	String getAntecedentSystem();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCTopologyView#getAntecedentSystem <em>Antecedent System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent System</em>' attribute.
	 * @see #getAntecedentSystem()
	 * @generated
	 */
	void setAntecedentSystem(String value);

	/**
	 * Returns the value of the '<em><b>Antecedent FC Port WWN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The FC Port Name Identifier (FC Port WWN) of the FCPort the antecedent reference is associated to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Antecedent FC Port WWN</em>' attribute.
	 * @see #setAntecedentFCPortWWN(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCTopologyView_AntecedentFCPortWWN()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getAntecedentFCPortWWN();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCTopologyView#getAntecedentFCPortWWN <em>Antecedent FC Port WWN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent FC Port WWN</em>' attribute.
	 * @see #getAntecedentFCPortWWN()
	 * @generated
	 */
	void setAntecedentFCPortWWN(String value);

	/**
	 * Returns the value of the '<em><b>Antecedent FC Port Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The user friendly name of the FCPort the antecedent reference is associated to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Antecedent FC Port Element Name</em>' attribute.
	 * @see #setAntecedentFCPortElementName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCTopologyView_AntecedentFCPortElementName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getAntecedentFCPortElementName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCTopologyView#getAntecedentFCPortElementName <em>Antecedent FC Port Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent FC Port Element Name</em>' attribute.
	 * @see #getAntecedentFCPortElementName()
	 * @generated
	 */
	void setAntecedentFCPortElementName(String value);

	/**
	 * Returns the value of the '<em><b>Antecedent Element WWN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The FC Switch Name Identifier (FC Switch WWN) or FC Node Name (FC Node WNN) the AntecedentFCPort is associated to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Antecedent Element WWN</em>' attribute.
	 * @see #setAntecedentElementWWN(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCTopologyView_AntecedentElementWWN()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getAntecedentElementWWN();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCTopologyView#getAntecedentElementWWN <em>Antecedent Element WWN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent Element WWN</em>' attribute.
	 * @see #getAntecedentElementWWN()
	 * @generated
	 */
	void setAntecedentElementWWN(String value);

	/**
	 * Returns the value of the '<em><b>Antecedent FC Port Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PortType of the FCPort the dependent reference is associated to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Antecedent FC Port Type</em>' attribute.
	 * @see #setAntecedentFCPortType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCTopologyView_AntecedentFCPortType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getAntecedentFCPortType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCTopologyView#getAntecedentFCPortType <em>Antecedent FC Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent FC Port Type</em>' attribute.
	 * @see #getAntecedentFCPortType()
	 * @generated
	 */
	void setAntecedentFCPortType(Integer value);

	/**
	 * Returns the value of the '<em><b>Dependent FC Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The dependent FCPort that is communicating with the antecedent FCPort.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependent FC Port</em>' attribute.
	 * @see #setDependentFCPort(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCTopologyView_DependentFCPort()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Reference='CIM_FCPort'"
	 * @generated
	 */
	String getDependentFCPort();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCTopologyView#getDependentFCPort <em>Dependent FC Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent FC Port</em>' attribute.
	 * @see #getDependentFCPort()
	 * @generated
	 */
	void setDependentFCPort(String value);

	/**
	 * Returns the value of the '<em><b>Dependent System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The System of the dependent FCPort in the DependentFCPort SystemDevice association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependent System</em>' attribute.
	 * @see #setDependentSystem(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCTopologyView_DependentSystem()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Reference='CIM_System'"
	 * @generated
	 */
	String getDependentSystem();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCTopologyView#getDependentSystem <em>Dependent System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent System</em>' attribute.
	 * @see #getDependentSystem()
	 * @generated
	 */
	void setDependentSystem(String value);

	/**
	 * Returns the value of the '<em><b>Dependent FC Port WWN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The FC Port Name Identifier (FC Port WWN) of the FCPort the dependent reference is associated to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependent FC Port WWN</em>' attribute.
	 * @see #setDependentFCPortWWN(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCTopologyView_DependentFCPortWWN()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getDependentFCPortWWN();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCTopologyView#getDependentFCPortWWN <em>Dependent FC Port WWN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent FC Port WWN</em>' attribute.
	 * @see #getDependentFCPortWWN()
	 * @generated
	 */
	void setDependentFCPortWWN(String value);

	/**
	 * Returns the value of the '<em><b>Dependent FC Port Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The user friendly name of the FCPort the dependent reference is associated to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependent FC Port Element Name</em>' attribute.
	 * @see #setDependentFCPortElementName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCTopologyView_DependentFCPortElementName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getDependentFCPortElementName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCTopologyView#getDependentFCPortElementName <em>Dependent FC Port Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent FC Port Element Name</em>' attribute.
	 * @see #getDependentFCPortElementName()
	 * @generated
	 */
	void setDependentFCPortElementName(String value);

	/**
	 * Returns the value of the '<em><b>Dependent Element WWN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The FC Switch Name Identifier (FC Switch WWN) or FC Node Name (FC Node WNN) the DependentFCPort is associated to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependent Element WWN</em>' attribute.
	 * @see #setDependentElementWWN(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCTopologyView_DependentElementWWN()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getDependentElementWWN();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCTopologyView#getDependentElementWWN <em>Dependent Element WWN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent Element WWN</em>' attribute.
	 * @see #getDependentElementWWN()
	 * @generated
	 */
	void setDependentElementWWN(String value);

	/**
	 * Returns the value of the '<em><b>Dependent FC Port Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PortType of the FCPort the dependent reference is associated to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependent FC Port Type</em>' attribute.
	 * @see #setDependentFCPortType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCTopologyView_DependentFCPortType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getDependentFCPortType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCTopologyView#getDependentFCPortType <em>Dependent FC Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent FC Port Type</em>' attribute.
	 * @see #getDependentFCPortType()
	 * @generated
	 */
	void setDependentFCPortType(Integer value);

} // CIM_FCTopologyView
