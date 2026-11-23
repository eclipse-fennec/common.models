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
 * A representation of the model object '<em><b>CIM Provides Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association represents a ProtocolEndpoint that is provided by a Service to allow access to the Service.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ProvidesEndpoint()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Core::Service' override.Antecedent='CIM_Service REF' override.Antecedent.Description='The Service that is accessed by the ProtocolEndpoint.' override.Dependent='CIM_ProtocolEndpoint REF' override.Dependent.Description='The ProtocolEndpoint that provides access to the Service.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ProvidesEndpoint extends CIM_ServiceAccessBySAP {
} // CIM_ProvidesEndpoint
