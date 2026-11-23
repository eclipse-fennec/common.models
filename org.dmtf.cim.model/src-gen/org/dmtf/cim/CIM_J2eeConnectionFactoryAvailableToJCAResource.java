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
 * A representation of the model object '<em><b>CIM J2ee Connection Factory Available To JCA Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_J2eeConnectionFactoryAvailableToJCAResource is an association that identifies the connection factory that is available to a CIM_J2eeJCAResource object.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeConnectionFactoryAvailableToJCAResource()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::Application::J2eeAppServer' override.Dependent='CIM_J2eeJCAResource REF' override.Dependent.Min='1' override.Dependent.Max='1' override.Dependent.Description='The JCA Resource that requires a Connection Factory.' override.Antecedent='CIM_J2eeJCAConnectionFactory REF' override.Antecedent.Min='1' override.Antecedent.Description='The Connection Factory being used by a JCA Resource.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeConnectionFactoryAvailableToJCAResource extends CIM_HostedDependency {
} // CIM_J2eeConnectionFactoryAvailableToJCAResource
