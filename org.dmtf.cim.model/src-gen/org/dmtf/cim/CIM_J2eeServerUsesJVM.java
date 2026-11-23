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
 * A representation of the model object '<em><b>CIM J2ee Server Uses JVM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The association between a J2EE server and the Java virtual machine on which the J2EE server has running threads.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeServerUsesJVM()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::Application::J2eeAppServer' override.Antecedent='CIM_J2eeJVM REF' override.Antecedent.Min='1' override.Antecedent.Description='The Java VM that is used by the J2ee Server.' override.Dependent='CIM_J2eeServer REF' override.Dependent.Min='1' override.Dependent.Description='The J2ee Server that has threads running on the JVM.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeServerUsesJVM extends CIM_Dependency {
} // CIM_J2eeServerUsesJVM
