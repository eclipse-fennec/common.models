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
 * A representation of the model object '<em><b>CIM Binds To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association establishes a ServiceAccessPoint as a requestor of protocol services from a ProtocolEndpoint. Typically, this association runs between SAPs and endpoints on a single system. Because a ProtocolEndpoint is a kind of ServiceAccessPoint, this binding can be used to establish a layering of two protocols, with the upper layer represented by the Dependent and the lower layer represented by the Antecedent.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BindsTo()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Core::Service' override.Antecedent='CIM_ProtocolEndpoint REF' override.Antecedent.Description='The lower-level endpoint that is accessed by the SAP.' override.Dependent='CIM_ServiceAccessPoint REF' override.Dependent.Description='The AccessPoint or ProtocolEndpoint that is dependent on the lower-level endpoint.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_BindsTo extends CIM_SAPSAPDependency {
} // CIM_BindsTo
